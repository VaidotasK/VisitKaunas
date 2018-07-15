package com.example.android.visitkaunas;

import android.content.Context;
import android.content.Intent;

public class InformationFullExtraProvider {

    public InformationFullExtraProvider() {
    }

    /**
     * Method to start new activity and put needed data into new intent via putExtra
     *
     * @param context                   current context in which item is clicked
     * @param placeNameExtra            Name of the place which is clicked
     * @param placeImageResourceIdExtra ImageResourceId of the place which is clicked
     * @param placeAddressExtra         Address of the place which is clicked
     * @param placePriceExtra           Price of the place which is clicked
     * @param placeDescriptionExtra     Description/working hours of the place which is clicked
     */
    public void provideExtraForInformationFullActivity(Context context, String placeNameExtra,
                                                       int placeImageResourceIdExtra, String placeAddressExtra,
                                                       String placePriceExtra, String placeDescriptionExtra) {

        Intent intent = new Intent(context, PlaceInformationFullActivity.class);
        intent.putExtra("extra_placeName", placeNameExtra);
        intent.putExtra("extra_placeImageResourceId", placeImageResourceIdExtra);
        intent.putExtra("extra_placeAddress", placeAddressExtra);
        intent.putExtra("extra_placePrice", placePriceExtra);
        intent.putExtra("extra_placeDescription", placeDescriptionExtra);

        context.startActivity(intent);
    }

}
