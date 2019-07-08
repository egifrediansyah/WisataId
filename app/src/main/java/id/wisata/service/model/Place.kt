package id.wisata.service.model

class Place {

    var id: Int? = null
    var name: String? = null
    var imageUrl: Int = 0
    var address: String? = null
    var rating: Float? = null

    constructor() {

    }

    constructor(id: Int, name: String, imageUrl: Int, address: String, rating: Float?) {
        this.id = id
        this.name = name
        this.imageUrl = imageUrl
        this.address = address
        this.rating = rating
    }
}
