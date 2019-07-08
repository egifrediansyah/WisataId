package id.wisata

import android.app.Application
import id.wisata.service.PlaceRepo

class StartApp : Application() {
    fun getPlaceRepo() = PlaceRepo(this)
}