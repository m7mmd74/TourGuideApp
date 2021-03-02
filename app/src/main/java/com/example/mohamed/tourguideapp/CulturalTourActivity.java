package com.example.mohamed.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CulturalTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_tour);

        ArrayList<ItemTour> items = new ArrayList<>();
        items.add(new ItemTour(getString(R.string.abusimbel), getString(R.string.abusimbeldescription) +
                getString(R.string.abusimbeldescription2), R.drawable.abusimbel));
        items.add(new ItemTour(getString(R.string.philae), getString(R.string.phileadescription), R.drawable.philae));
        items.add(new ItemTour(getString(R.string.karnak), getString(R.string.karnakdescription), R.drawable.karnak));
        items.add(new ItemTour(getString(R.string.kingsvalley), getString(R.string.kingsvalleydescription), R.drawable.kingsvalley));
        items.add(new ItemTour(getString(R.string.pyramids), getString(R.string.pyramidsdescription), R.drawable.pyramids));
        items.add(new ItemTour(getString(R.string.saqqara), getString(R.string.saqqaradescreption), R.drawable.saqqara));
        items.add(new ItemTour(getString(R.string.egymuem), getString(R.string.egymuesumdescription), R.drawable.egyptmeusum));
        items.add(new ItemTour(getString(R.string.libalex), getString(R.string.libalexdescription), R.drawable.alexlibrary));

        ItemTourAdapter adapter = new ItemTourAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.activity_cultural_tour);
        listView.setAdapter(adapter);
    }
}