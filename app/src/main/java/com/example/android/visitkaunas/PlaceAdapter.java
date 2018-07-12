package com.example.android.visitkaunas;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_place, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        TextView placeNameTextView = convertView.findViewById(R.id.place_name_textView);
        placeNameTextView.setText(currentPlace.getPlaceName());

        ImageView placeImageImageView = convertView.findViewById(R.id.place_image_imageView);
        if (currentPlace.hasImage()) {
            placeImageImageView.setImageResource(currentPlace.getPlaceImageResourceId());
            placeImageImageView.setVisibility(View.VISIBLE);
        } else {
            placeImageImageView.setVisibility(View.GONE);
        }

        TextView placeAddressTextView = convertView.findViewById(R.id.place_address_textView);
        placeAddressTextView.setText(currentPlace.getPlaceAddress());


        return convertView;
    }
}
