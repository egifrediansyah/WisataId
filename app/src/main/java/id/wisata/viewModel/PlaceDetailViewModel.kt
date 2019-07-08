package id.wisata.viewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import id.wisata.StartApp
import id.wisata.data.model.Place

class PlaceDetailViewModel(application: Application) : AndroidViewModel(application) {

    private val PlaceRepository = getApplication<StartApp>().getPlaceRepo()
    private val PlaceId = MutableLiveData<Int>()

    //Maps Place Id to Place Detail
    fun getPlaceDetails(id: Int) : LiveData<Place>{
        PlaceId.value = id
        val PlaceDetails = Transformations.switchMap<Int, Place>(PlaceId) { id ->
            PlaceRepository.findPlace(id)
        }
        return PlaceDetails
    }
}