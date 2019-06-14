package id.wisata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Place> lstPlace;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        lstPlace = new ArrayList<>();
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));
        lstPlace.add(new Place("Gunung Api", R.drawable.mountain_example, "kedoya utara", 4.5f));




        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, lstPlace);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);

    }
}
