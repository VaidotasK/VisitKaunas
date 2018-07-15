package com.example.android.visitkaunas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlaceInformationFullActivity extends AppCompatActivity {

    private static final int NO_IMAGE = -1;
    private static final String NO_DESCRIPTION = "";
    private static final String NO_PRICE = "";
    String currentPlaceName;
    int currentPlaceImageResourceId;
    String currentPlaceAddress;
    String currentPlacePrice;
    String currentPlaceDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_full_info);

        Bundle extra = getIntent().getExtras();
        if (null != extra) {
            currentPlaceName = extra.getString("extra_placeName");
            currentPlaceImageResourceId = extra.getInt("extra_placeImageResourceId", 0);
            currentPlaceAddress = extra.getString("extra_placeAddress");
            currentPlacePrice = extra.getString("extra_placePrice");
            currentPlaceDescription = extra.getString("extra_placeDescription");

            TextView currentPlaceNameTextView = findViewById(R.id.place_full_info_name);
            currentPlaceNameTextView.setText(currentPlaceName);

            ImageView currentPlaceImageResourceIdImageView = findViewById(R.id.place_full_info_image);

            if (NO_IMAGE != currentPlaceImageResourceId) {
                currentPlaceImageResourceIdImageView.setImageResource(currentPlaceImageResourceId);
                currentPlaceImageResourceIdImageView.setVisibility(View.VISIBLE);
            } else {
                currentPlaceImageResourceIdImageView.setVisibility(View.GONE);
            }

            TextView currentPlaceAddressTextView = findViewById(R.id.place_full_info_address);
            currentPlaceAddressTextView.setText(currentPlaceAddress);

            TextView currentPlacePriceTextView = findViewById(R.id.place_full_info_price);
            if (currentPlacePrice.equals(NO_PRICE)) {
                currentPlacePriceTextView.setVisibility(View.GONE);
            } else {
                currentPlacePriceTextView.setText(currentPlacePrice);
                currentPlacePriceTextView.setVisibility(View.VISIBLE);

            }

            TextView currentPlaceDescriptionTextView = findViewById(R.id.place_full_info_description);
            if (currentPlaceDescription.equals(NO_DESCRIPTION)) {
                currentPlaceDescriptionTextView.setVisibility(View.GONE);
            } else {
                currentPlaceDescriptionTextView.setText(currentPlaceDescription);
                currentPlaceAddressTextView.setVisibility(View.VISIBLE);
            }
        }

    }
}
