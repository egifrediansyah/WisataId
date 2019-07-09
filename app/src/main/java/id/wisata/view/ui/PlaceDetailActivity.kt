package id.wisata.view.ui

import android.arch.lifecycle.ViewModelProviders
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import id.wisata.R
import id.wisata.data.model.Place
import id.wisata.viewModel.PlaceDetailViewModel
import kotlinx.android.synthetic.main.item_place_detail.*

class PlaceDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: PlaceDetailViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_place_detail)
        viewModel = ViewModelProviders.of(this).get(PlaceDetailViewModel::class.java)
        btn_back.setOnClickListener {
            onBackPressed()
            val PlaceId = 0
            PlaceId?.let {
                viewModel.getPlaceDetails(PlaceId).observe(this, Observer { PlaceDetails ->
                    if (PlaceDetails != null) {
                        populatePlaceDetails(PlaceDetails)
                    }
                })
            }
        }


    }

    private fun populatePlaceDetails(place: Place) {
        placePicture.setImageDrawable(resources.getDrawable(place.imageUrl))
        ratingbar.rating = place?.rating!!
    }
}