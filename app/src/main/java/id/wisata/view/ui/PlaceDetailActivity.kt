package id.wisata.view.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import id.wisata.R
import id.wisata.viewModel.PlaceDetailViewModel
import kotlinx.android.synthetic.main.item_place_detail.*

class PlaceDetailActivity : AppCompatActivity(){

    private lateinit var viewModel : PlaceDetailViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.item_place_detail)
        btn_back.setOnClickListener {
           onBackPressed()
            getPlaceDetail()

        }
    }

    private fun getPlaceDetail(){
//        val PlaceId = arguments?.getInt(getString(R.string.place_id))
//        PlaceId?.let{
//            viewModel.getBookDetails(BookId).observe(this, Observer { BookDetails ->
//                populateBookDetails(BookDetails)
//            })
    }


}