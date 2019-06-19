package id.wisata.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import id.wisata.R
import id.wisata.service.model.Place

class RecyclerViewAdapter(private val ctx: Context, private val data: List<Place>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {

        val view: View
        val inflater = LayoutInflater.from(ctx)
        view = inflater.inflate(R.layout.place_item_card_view, viewGroup, false)

        return MyViewHolder(view)
    }


    override fun onBindViewHolder(myViewHolder: MyViewHolder, i: Int) {

        myViewHolder.placeName.text = data[i].name
        myViewHolder.placePicture.setImageResource(data[i].imageUrl)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var placeName: TextView
        internal var placePicture: ImageView

        init {

            placeName = itemView.findViewById<View>(R.id.placeName) as TextView
            placePicture = itemView.findViewById<View>(R.id.placePicture) as ImageView
        }
    }
}
