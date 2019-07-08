package id.wisata.service

import android.app.Application
import android.arch.lifecycle.LiveData
import id.wisata.data.model.Place
import id.wisata.service.database.PlaceDB
import id.wisata.service.database.PlaceDao

class PlaceRepo(application: Application) {
    private val placeDao : PlaceDao

    init {
        val placeDatabase = PlaceDB.getInstance(application)
        placeDao = placeDatabase.placeDao()
    }

    fun getAllPlace() : LiveData<List<Place>> {

        return placeDao.getAll()
    }
    fun insertPlace(place: Place){
        placeDao.insert(place)
    }
    fun findPlace(id: Int) : LiveData<Place> {
        return placeDao.find(id)
    }
}