package id.wisata.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import id.wisata.HomeActivity
import id.wisata.R
import kotlinx.android.synthetic.main.sign_in_layout.*


class Login  : AppCompatActivity() {

    private val RC_SIGN_IN = 1

    private lateinit var mGoogleSignClient : GoogleSignInClient

    private lateinit var mAuth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_layout)

        //inisialisasi mAuth
        mAuth = FirebaseAuth.getInstance()
        val gso = GoogleSignInOptions.Builder(
            GoogleSignInOptions.DEFAULT_SIGN_IN
        ).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build()

        mGoogleSignClient = GoogleSignIn.getClient(this, gso)
       sign_in_button.setOnClickListener{
            signIn()
        }
    }



    private fun  signIn(){
        val signInIntent = mGoogleSignClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }
    private fun firebaseAuthWithGoogle(
        acct: GoogleSignInAccount
    ){
        Log.d("LOGIN", "firebaseAuth"+ acct.id!! )

        val credential = GoogleAuthProvider.getCredential(acct.idToken, null)

        mAuth.signInWithCredential(credential).addOnCompleteListener(this){
                task ->
            if (task.isSuccessful){
                Log.d("LOGIN", "Sign In SUKSES")
                val user = mAuth.currentUser
                updateUI(user)

            }else{
                Log.w("LOGIN", "Sign In Error", task.exception)
                Toast.makeText(this, "Sign In Failure", Toast.LENGTH_SHORT).show()
                updateUI(null)
            }
        }
    }

    fun updateUI(user : FirebaseUser?){
        if(user != null){
            Toast.makeText(this, "Hello"+
                    "${user.displayName}",
                Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Login, HomeActivity::class.java))
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if(requestCode == RC_SIGN_IN){
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(
                    ApiException::class.java
                )
                firebaseAuthWithGoogle(account!!)
            }catch (e: ApiException){
                Log.w("LOGIN", "login failed", e)
            }

        }
    }

    override fun onStart() {
        super.onStart()
        val currentUser = mAuth.currentUser
        updateUI(currentUser)
    }
}