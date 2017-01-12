package com.example.android.torontoguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(R.drawable.ago_main, getString(R.string.ago_name), getString(R.string.ago_address), getString(R.string.ago_phone), getString(R.string.ago_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
