package id.wisata

class Place {

    var name: String? = null
    var imageUrl: Int = 0
    var address: String? = null
    var rating: Float? = null

    constructor() {

    }

    constructor(name: String, imageUrl: Int, address: String, rating: Float?) {
        this.name = name
        this.imageUrl = imageUrl
        this.address = address
        this.rating = rating
    }
}
