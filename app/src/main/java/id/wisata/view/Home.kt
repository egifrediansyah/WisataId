package id.wisata.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import id.wisata.Place
import id.wisata.R
import id.wisata.RecyclerViewAdapter

import java.util.ArrayList

class Home : AppCompatActivity() {

    lateinit var lstPlace: MutableList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

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


        val recyclerView = findViewById<View>(R.id.recyclerview_id) as RecyclerView
        val adapter = RecyclerViewAdapter(this, lstPlace)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = adapter

    }
}
