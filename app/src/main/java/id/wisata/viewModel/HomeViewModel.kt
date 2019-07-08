package id.wisata.viewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import id.wisata.data.model.Place
import id.wisata.StartApp

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val placeRepo = getApplication<StartApp>().getPlaceRepo()
    private val placeList = MediatorLiveData<List<Place>>()

    init {
        getAllPlace()
    }

    fun getPlaceList() : LiveData<List<Place>> {
        return placeList
    }

    fun getAllPlace(){
        placeList.addSource(placeRepo.getAllPlace()){
                places -> placeList.postValue(places)
        }
    }
}