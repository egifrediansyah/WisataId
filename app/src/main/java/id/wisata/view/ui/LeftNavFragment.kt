package id.wisata.view.ui

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import id.wisata.R
import android.support.v4.widget.DrawerLayout
import android.view.Gravity
import android.widget.ListView




class LeftNavFragment : Fragment() {

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_left_nav, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val navDrawer : DrawerLayout = activity!!.findViewById(R.id.drawer_layout)
        navDrawer.openDrawer(Gravity.START)
    }
}