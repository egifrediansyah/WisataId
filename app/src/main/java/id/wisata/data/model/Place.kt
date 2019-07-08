package id.wisata.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Place {


    var name: String = ""
    var imageUrl: Int = 0
    var address: String = ""
    var rating: Float? = 0.0f
    @PrimaryKey(autoGenerate = true) var id: Int = 0

    constructor(id: Int, name: String, imageUrl: Int, address: String, rating: Float?) {
        this.id = id
        this.name = name
        this.imageUrl = imageUrl
        this.address = address
        this.rating = rating
    }
}
