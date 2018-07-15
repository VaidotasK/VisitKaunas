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
public class ExtraPlacesFragment extends Fragment {


    public ExtraPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.extraPlace_name_1), R.drawable.extra_places_1_image,
                getString(R.string.extraPlace_address_1), getString(R.string.extraPlace_price_1),
                getString(R.string.extraPlace_description_1)));
        places.add(new Place(getString(R.string.extraPlace_name_2), R.drawable.extra_places_2_image,
                getString(R.string.extraPlace_address_2), getString(R.string.extraPlace_price_2),
                getString(R.string.extraPlace_description_2)));
        places.add(new Place(getString(R.string.extraPlace_name_3), R.drawable.extra_places_3_image,
                getString(R.string.extraPlace_address_3), getString(R.string.extraPlace_price_3),
                getString(R.string.extraPlace_description_3)));
        places.add(new Place(getString(R.string.extraPlace_name_4), R.drawable.extra_places_4_image,
                getString(R.string.extraPlace_address_4), getString(R.string.extraPlace_price_4),
                getString(R.string.extraPlace_description_4)));
        places.add(new Place(getString(R.string.extraPlace_name_5), R.drawable.extra_places_5_image,
                getString(R.string.extraPlace_address_5), getString(R.string.extraPlace_price_5),
                getString(R.string.extraPlace_description_5)));
        places.add(new Place(getString(R.string.extraPlace_name_6), R.drawable.extra_places_6_image,
                getString(R.string.extraPlace_address_6), getString(R.string.extraPlace_price_6),
                getString(R.string.extraPlace_description_6)));
        places.add(new Place(getString(R.string.extraPlace_name_7), R.drawable.extra_places_7_image,
                getString(R.string.extraPlace_address_7), getString(R.string.extraPlace_price_7),
                getString(R.string.extraPlace_description_7)));
        places.add(new Place(getString(R.string.extraPlace_name_8), R.drawable.extra_places_8_image,
                getString(R.string.extraPlace_address_8), getString(R.string.extraPlace_price_8),
                getString(R.string.extraPlace_description_8)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place place = places.get(position);

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
