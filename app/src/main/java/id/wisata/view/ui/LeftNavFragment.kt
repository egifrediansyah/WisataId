package id.wisata.view.ui

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import id.wisata.R


class LeftNavFragment : Fragment() {

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_left_nav, container, false)
        return view
    }
}