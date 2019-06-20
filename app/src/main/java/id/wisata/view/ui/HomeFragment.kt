package id.wisata.view.ui


import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import id.wisata.R
import id.wisata.service.model.Place
import java.util.ArrayList


class HomeFragment : Fragment() {
    lateinit var lstPlace: MutableList<Place>

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        val context = inflater.context

        lstPlace = ArrayList()
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))


        val recyclerView =view.findViewById(R.id.recyclerview_id) as RecyclerView
        val adapter = id.wisata.view.adapter.RecyclerViewAdapter(context, lstPlace)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = adapter
        return view
    }
}