package com.example.android.visitkaunas.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.visitkaunas.InformationFullExtraProvider;
import com.example.android.visitkaunas.Place;
import com.example.android.visitkaunas.PlaceAdapter;
import com.example.android.visitkaunas.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);
//        Create list of museums
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.museum_name_1), R.drawable.museum_1_image,
                getString(R.string.museum_address_1), getString(R.string.museum_price_1),
                getString(R.string.museum_description_1)));
        places.add(new Place(getString(R.string.museum_name_2), R.drawable.museum_2_image,
                getString(R.string.museum_address_2), getString(R.string.museum_price_2),
                getString(R.string.museum_description_2)));
        places.add(new Place(getString(R.string.museum_name_3), R.drawable.museum_3_image,
                getString(R.string.museum_address_3), getString(R.string.museum_price_3),
                getString(R.string.museum_description_3)));
        places.add(new Place(getString(R.string.museum_name_4), R.drawable.museum_4_image,
                getString(R.string.museum_address_4), getString(R.string.museum_price_4),
                getString(R.string.museum_description_4)));
        places.add(new Place(getString(R.string.museum_name_5), R.drawable.museum_5_image,
                getString(R.string.museum_address_5), getString(R.string.museum_price_5),
                getString(R.string.museum_description_5)));
        places.add(new Place(getString(R.string.museum_name_6), R.drawable.museum_6_image,
                getString(R.string.museum_address_6), getString(R.string.museum_price_6),
                getString(R.string.museum_description_6)));
        places.add(new Place(getString(R.string.museum_name_7), R.drawable.museum_7_image,
                getString(R.string.museum_address_7), getString(R.string.museum_price_7),
                getString(R.string.museum_description_7)));
        places.add(new Place(getString(R.string.museum_name_8), R.drawable.museum_8_image,
                getString(R.string.museum_address_8), getString(R.string.museum_price_8),
                getString(R.string.museum_description_8)));
        places.add(new Place(getString(R.string.museum_name_9), R.drawable.museum_9_image,
                getString(R.string.museum_address_9), getString(R.string.museum_price_9),
                getString(R.string.museum_description_9)));

//        Create new adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
//        Set adapter to the list view
        listView.setAdapter(adapter);
//Set onItemClickListener to open new activity and put all data needed to next activity
// (PlaceInformationFullActivity)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Get position of which list item is pressed
                Place place = places.get(position);
//                Create new object from custom class, which purpose is collect EXTRAS and send to
// new intent (PlaceInformationFullActivity)
                InformationFullExtraProvider informationFullExtraProvider =
                        new InformationFullExtraProvider();
                informationFullExtraProvider.provideExtraForInformationFullActivity(getContext(),
                        place.getPlaceName(), place.getPlaceImageResourceId(),
                        place.getPlaceAddress(), place.getPlacePrice(), place.getPlaceDescription());

            }
        });


        return rootView;
    }

}
