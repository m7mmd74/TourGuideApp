package com.example.mohamed.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_tour);

        ArrayList<ItemTour> items = new ArrayList<>();
        items.add(new ItemTour(getString(R.string.mosesmountin), getString(R.string.mosesmountindescerption), R.drawable.moses));
        items.add(new ItemTour(getString(R.string.saint), getString(R.string.saintdescription), R.drawable.saint));
        items.add(new ItemTour(getString(R.string.khankhalili), getString(R.string.khankhalilidescription), R.drawable.khan));
        items.add(new ItemTour(getString(R.string.moez), getString(R.string.moezdescription), R.drawable.moez));
        items.add(new ItemTour(getString(R.string.hakim), getString(R.string.hakimdescription) +
                "\n" +
                getString(R.string.hakimdescription2), R.drawable.alhakim));
        items.add(new ItemTour(getString(R.string.hussein), getString(R.string.husseindescription), R.drawable.hussein));
        items.add(new ItemTour(getString(R.string.salahdin), getString(R.string.salahdindescription), R.drawable.salahdin));

        ItemTourAdapter adapter = new ItemTourAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.activity_religious_tour);
        listView.setAdapter(adapter);
    }
}