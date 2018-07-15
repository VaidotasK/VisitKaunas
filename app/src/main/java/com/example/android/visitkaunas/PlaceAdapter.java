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

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} which provides layout for every list item using
 * list of {@link Place} objects
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create new PlaceAdapter object
     *
     * @param context is current context in which adapter is created (ex. MainActivity)
     * @param places  list of {@link Place}s objects
     */
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

        // Find TextView container in list_item_place.xml for name
        TextView placeNameTextView = convertView.findViewById(R.id.place_name_textView);
        //Get current place name from currentPlace and set it to place name TextView
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Find ImageView container in list_item_place.xml for image
        ImageView placeImageImageView = convertView.findViewById(R.id.place_image_imageView);
        //Check if image for current place is provided
        if (currentPlace.hasImage()) {
            //If yes set image to place image ImageView
            placeImageImageView.setImageResource(currentPlace.getPlaceImageResourceId());
            //and make it visible
            placeImageImageView.setVisibility(View.VISIBLE);

        } else {
            //if not provided, set visibility of place Image ImageView to GONE
            placeImageImageView.setVisibility(View.GONE);
        }

        // Find TextView container in list_item_place.xml for address
        TextView placeAddressTextView = convertView.findViewById(R.id.place_address_textView);
        //Get current place address from currentPlace and set it to place address TextView
        placeAddressTextView.setText(currentPlace.getPlaceAddress());

        //Return whole list item layout which now can be shown in convertView
        return convertView;
    }
}
