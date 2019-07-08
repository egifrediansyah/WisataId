package id.wisata.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.wisata.R
import id.wisata.data.model.Place
import kotlinx.android.synthetic.main.place_item_card_view.view.*

class RecyclerViewAdapter(private val ctx: Context,
                          private  val items: List<Place>,
                          private val clickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    interface OnItemClickListener{
        fun onItemClick(place: Place, itemView : View)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val view: View
        val inflater = LayoutInflater.from(ctx)
        view = inflater.inflate(R.layout.place_item_card_view, viewGroup, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, i: Int) {

        (holder).bind(items[i], clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(place: Place, listener: OnItemClickListener) = with(itemView) {
            itemView.placeName.text = place.name
            placePicture.setImageDrawable(resources.getDrawable(place.imageUrl))



            setOnClickListener {
                listener.onItemClick(place, it)
            }
        }
    }
}
