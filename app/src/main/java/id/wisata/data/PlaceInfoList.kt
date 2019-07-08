package id.wisata.data

import id.wisata.R
import id.wisata.data.model.Place

class PlaceInfoList {
    companion object {
        var lstPlace = initPlaceList()
        private fun initPlaceList() : MutableList<Place> {
            var po_place = mutableListOf<Place>()

            po_place.add(
                Place(
                    1,
                    "Gunung Api",
                    R.drawable.mountain_example,
                    "kedoya utara",
                    4.5f
                )
            )
            po_place.add(Place(2, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(3, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(4, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(5, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(6, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(7, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(8, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(9, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(10, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(11, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(12, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(13, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(14, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(15, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(16, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(17, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(18, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(19, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(20, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
            po_place.add(Place(21, "Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f))
        return po_place
        }
    }
}