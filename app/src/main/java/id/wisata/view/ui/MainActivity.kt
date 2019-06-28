package id.wisata.view.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import id.wisata.R
import android.support.annotation.NonNull
import android.view.MenuItem


class MainActivity : AppCompatActivity(),  BottomNavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bn_main)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }
    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (item.getItemId()) {
            R.id.home_menu -> fragment = HomeFragment()
            R.id.search_menu -> fragment = SearchFragment()
//            R.id.left_nav -> fragment = LeftNavFragment()

        }
        return loadFragment(fragment)
    }
}