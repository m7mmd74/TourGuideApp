package com.example.mohamed.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainingTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertaining_tour);

        ArrayList<ItemTour> items = new ArrayList<>();
        items.add(new ItemTour(getString(R.string.sharm), getString(R.string.sharmdescription), R.drawable.sharmelsheikh));
        items.add(new ItemTour(getString(R.string.dahab), getString(R.string.dahabdescription), R.drawable.dahab));
        items.add(new ItemTour(getString(R.string.marsamatrouh), getString(R.string.marsamatrouhdescription), R.drawable.mersamatrouh));
        items.add(new ItemTour(getString(R.string.hurghada), getString(R.string.hurghadadescription), R.drawable.hurghada));
        items.add(new ItemTour(getString(R.string.nuweiba), getString(R.string.nuweibadescription)
                + "\n" + getString(R.string.nuweibadescription2), R.drawable.nueiba));
        items.add(new ItemTour(getString(R.string.alex), getString(R.string.alexdescription), R.drawable.alex));
        items.add(new ItemTour(getString(R.string.Khaleg_Ne3ema), getString(R.string.Khaleg_Ne3ema_description), R.drawable.khaleg_ne3ma));
        ItemTourAdapter adapter = new ItemTourAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.activity_entertaining_tour);
        listView.setAdapter(adapter);
    }
}