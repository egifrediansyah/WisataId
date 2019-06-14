package id.wisata;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context ctx;
    private List<Place> data;

    public RecyclerViewAdapter(Context ctx, List<Place> data){
        this.ctx = ctx;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(ctx);
        view = inflater.inflate(R.layout.place_item_card_view, viewGroup, false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.placeName.setText(data.get(i).getName());
        myViewHolder.placePicture.setImageResource(data.get(i).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {

        TextView placeName;
        ImageView placePicture;

        public MyViewHolder(View itemView) {
            super(itemView);

            placeName = (TextView) itemView.findViewById(R.id.placeName);
            placePicture = (ImageView) itemView.findViewById(R.id.placePicture);
        }
    }
}
