package id.wisata.view.ui


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import id.wisata.R
import id.wisata.data.model.Place
import id.wisata.view.adapter.RecyclerViewAdapter
import id.wisata.viewModel.HomeViewModel

class HomeFragment : Fragment(),RecyclerViewAdapter.OnItemClickListener {
    override fun onItemClick(place: Place, itemView: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    lateinit var recyclerView : RecyclerView
    private lateinit var viewModel : HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        val context = inflater.context



        recyclerView =view.findViewById(R.id.recyclerview_id) as RecyclerView
        recyclerView.layoutManager = GridLayoutManager(context, 3)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPlaceList().observe(this, Observer<List<Place>>{
                places->places?.let{
            populatedPlaceList(places)
        }
        })
    }

    private fun populatedPlaceList(placeList: List<Place>){
        recyclerView.adapter = RecyclerViewAdapter(requireActivity(), placeList, this)
    }
}
