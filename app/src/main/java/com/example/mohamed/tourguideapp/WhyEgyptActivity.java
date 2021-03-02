package com.example.mohamed.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class WhyEgyptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_egypt);
        ArrayList<ItemTour> items = new ArrayList<>();
        items.add(new ItemTour(getString(R.string.reason1), getString(R.string.good_climate), R.drawable.mersamatrouh));
        items.add(new ItemTour(getString(R.string.reason2), getString(R.string.egyptian_food), R.drawable.egyptian_food_koshary));
        items.add(new ItemTour(getString(R.string.reason3), getString(R.string.nile_relax), R.drawable.nilecruise));
        items.add(new ItemTour(getString(R.string.reason4), getString(R.string.temples), R.drawable.philae));
        items.add(new ItemTour(getString(R.string.reason5), getString(R.string.friendly_locals), R.drawable.egyptsmile));

        ItemTourAdapter adapter = new ItemTourAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.activity_why_egypt);
        listView.setAdapter(adapter);
    }
}