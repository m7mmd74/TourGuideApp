package com.example.mohamed.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toursTextView = (TextView) findViewById(R.id.tours_text_view);
        toursTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ToursActivity.class);
                startActivity(i);

            }
        });
        TextView transportationTextView = (TextView) findViewById(R.id.transportation_text_view);
        transportationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TransportationActivity.class);
                startActivity(i);

            }
        });
        TextView whyEgyptTextView = (TextView) findViewById(R.id.why_egypt_text_view);
        whyEgyptTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, WhyEgyptActivity.class);
                startActivity(i);

            }
        });
    }
}