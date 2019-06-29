package id.wisata.view.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import id.wisata.R
import kotlinx.android.synthetic.main.item_place_detail.*

class PlaceDetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.item_place_detail)
        btn_back.setOnClickListener {
           onBackPressed()
        }
    }
}