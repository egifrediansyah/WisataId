package id.wisata.view.ui


import android.content.Intent
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
import id.wisata.view.adapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var lstPlace: MutableList<Place>
    lateinit var recyclerView : RecyclerView

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        val context = inflater.context

        lstPlace = ArrayList()
        lstPlace.add(Place(1,"Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(2, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(3, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(4, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(5, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(6, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(7, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(8, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(9, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(10, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(11, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(12, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(13, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(14, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(15, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(16, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(17, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(18, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(19, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(20 ,"Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        lstPlace.add(Place(21, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))

         recyclerView =view.findViewById(R.id.recyclerview_id) as RecyclerView
        val adapter = RecyclerViewAdapter(context, lstPlace)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = adapter
        return view
    }



}