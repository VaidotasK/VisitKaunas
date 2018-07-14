package com.example.android.visitkaunas;

import android.content.Context;
import android.content.Intent;

public class InformationFullExtraProvider {

    public InformationFullExtraProvider() {
    }

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
