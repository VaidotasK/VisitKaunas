package com.example.android.visitkaunas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceInformationFullActivity extends AppCompatActivity {

    //Create private variables

    /**
     * Constant value if no image is provided (pubs fragment)
     */
    private static final int NO_IMAGE = -1;
    /**
     * Constant value if no description is provided
     */
    private static final String NO_DESCRIPTION = "";
    /**
     * Constant value if no price is provided ex. for museums
     */
    private static final String NO_PRICE = "";
    /**
     * Pressed place name
     */
    String currentPlaceName;
    /**
     * Pressed place Image resource Id
     */
    int currentPlaceImageResourceId;

    //Constants of missing variables inputs
    /**
     * Pressed place Address
     */
    String currentPlaceAddress;
    /**
     * Pressed place Price
     */
    String currentPlacePrice;
    /**
     * Pressed place description
     */
    String currentPlaceDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_full_info);

        Bundle extra = getIntent().getExtras();
        if (null != extra) {

            //Store all data in new variables

            currentPlaceName = extra.getString("extra_placeName");
            currentPlaceImageResourceId = extra.getInt("extra_placeImageResourceId", 0);
            currentPlaceAddress = extra.getString("extra_placeAddress");
            currentPlacePrice = extra.getString("extra_placePrice");
            currentPlaceDescription = extra.getString("extra_placeDescription");

            //Finds textView in place_full_info_name.xml which is needed for current place name
            TextView currentPlaceNameTextView = findViewById(R.id.place_full_info_name);
            //Set place name from currentPlaceName to place full info textView
            currentPlaceNameTextView.setText(currentPlaceName);

            //Finds imageView in place_full_info_name.xml which is needed for current place Image
            ImageView currentPlaceImageResourceIdImageView = findViewById(R.id.place_full_info_image);

            //Checks in image is provided
            if (NO_IMAGE != currentPlaceImageResourceId) {
                // If yes, sets place image from currentPlaceImageResourceId to place full info imageView
                currentPlaceImageResourceIdImageView.setImageResource(currentPlaceImageResourceId);
                //and sets image visibility to VISIBLE
                currentPlaceImageResourceIdImageView.setVisibility(View.VISIBLE);
            } else {
                //if no, sets place image to default one
                currentPlaceImageResourceIdImageView.setImageResource(R.drawable.kaunas);
                //and sets image visibility to VISIBLE
                currentPlaceImageResourceIdImageView.setVisibility(View.VISIBLE);
            }
            //Finds textView in place_full_info_name.xml which is needed for current place address
            TextView currentPlaceAddressTextView = findViewById(R.id.place_full_info_address);
            //Set place address from currentPlaceAddress to place full info textView
            currentPlaceAddressTextView.setText(currentPlaceAddress);

            //Finds textView in place_full_info_name.xml which is needed for current place price
            TextView currentPlacePriceTextView = findViewById(R.id.place_full_info_price);
            //Checks if price is included
            if (currentPlacePrice.equals(NO_PRICE)) {
                //If no, set TextView to visibility Gone
                currentPlacePriceTextView.setVisibility(View.GONE);
            } else {
                //If yes, set place price from currentPlacePrice to place info textView
                currentPlacePriceTextView.setText(currentPlacePrice);
                //and sets TextView to visibility Visible
                currentPlacePriceTextView.setVisibility(View.VISIBLE);

            }
            //Finds textView in place_full_info_name.xml which is needed for current place description
            TextView currentPlaceDescriptionTextView = findViewById(R.id.place_full_info_description);
            //Checks if description is included
            if (currentPlaceDescription.equals(NO_DESCRIPTION)) {
                //if no, sets currentPlaceDescriptionTextView visibility to Gone
                currentPlaceDescriptionTextView.setVisibility(View.GONE);
            } else {
                //if yes, sets currentPlaceDescriptionTextView with description form current
                // place description
                currentPlaceDescriptionTextView.setText(currentPlaceDescription);
                //and sets visibility of that textView to visible
                currentPlaceAddressTextView.setVisibility(View.VISIBLE);
            }
        }

    }
}
