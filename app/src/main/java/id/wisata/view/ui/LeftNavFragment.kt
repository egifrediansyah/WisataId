package id.wisata.view.ui

import android.content.Intent
import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.design.widget.NavigationView
import id.wisata.R
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.*
import com.google.firebase.auth.FirebaseAuth
import id.wisata.view.*


class LeftNavFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener  {
    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_left_nav, container, false)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navDrawer : DrawerLayout = activity!!.findViewById(R.id.drawer_layout)
        navDrawer.openDrawer(Gravity.START)
        val drawerLayout: DrawerLayout = view.findViewById(R.id.drawer_layout)
        val navView: NavigationView = view.findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            activity, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }





    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when (p0.itemId) {
            R.id.popular -> {
                // Handle the camera action
            }
            R.id.chating -> {

            }
            R.id.logout -> {
                FirebaseAuth.getInstance().signOut()
                val intent = Intent(activity, Login::class.java)
                startActivity(intent)
                activity!!.finish()
                 

            }



        }
        return true
    }

}
