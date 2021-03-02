package com.example.mohamed.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemTourAdapter extends ArrayAdapter<ItemTour> {

    public ItemTourAdapter(Activity context, ArrayList<ItemTour> images) {

        super(context, 0, images);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.item_list, null, false);

        }
        ItemTour currentItem = getItem(position);
        TextView nameItemTextView = (TextView) listItemView.findViewById(R.id.item_name_text_view);
        nameItemTextView.setText(currentItem.getItemName());
        TextView aboutItemTextView = (TextView) listItemView.findViewById(R.id.item_about_text_view);
        aboutItemTextView.setText(currentItem.getItemAbout());
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.item_image_image_view);
        itemImageView.setImageResource(currentItem.getImageId());


        return listItemView;
    }

}