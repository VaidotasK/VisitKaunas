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
public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.church_name_1), R.drawable.church_1_image,
                getString(R.string.church_address_1), "", getString(R.string.church_description_1)));
        places.add(new Place(getString(R.string.church_name_2), R.drawable.church_2_image,
                getString(R.string.church_address_2), "", getString(R.string.church_description_2)));
        places.add(new Place(getString(R.string.church_name_3), R.drawable.church_3_image,
                getString(R.string.church_address_3), "", getString(R.string.church_description_3)));
        places.add(new Place(getString(R.string.church_name_4), R.drawable.church_4_image,
                getString(R.string.church_address_4), "", getString(R.string.church_description_4)));
        places.add(new Place(getString(R.string.church_name_5), R.drawable.church_5_image,
                getString(R.string.church_address_5), "", getString(R.string.church_description_5)));
        places.add(new Place(getString(R.string.church_name_6), R.drawable.church_6_image,
                getString(R.string.church_address_6), "", getString(R.string.church_description_6)));
        places.add(new Place(getString(R.string.church_name_7), R.drawable.church_7_image,
                getString(R.string.church_address_7), "", getString(R.string.church_description_7)));


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
