package com.example.android.torontoguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Olisp on 1/10/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity activity, ArrayList<Location> locations) {
        super(activity, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View locationItemView = convertView;

        if (locationItemView != null) {
            locationItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location location = getItem(position);

        TextView nameTV = (TextView) locationItemView.findViewById(R.id.locationName);
        nameTV.setText(location.getLocationName());

        TextView addressTV = (TextView) locationItemView.findViewById(R.id.locationAddress);
        addressTV.setText(location.getLocationAddress());

        TextView phoneTV = (TextView) locationItemView.findViewById(R.id.phoneNumber);
        phoneTV.setText(location.getLocationPhone());

        TextView descriptionTV = (TextView) locationItemView.findViewById(R.id.locationDescription);
        descriptionTV.setText(location.getLocationDescription());

        ImageView picture = (ImageView) locationItemView.findViewById(R.id.mainImage);
        picture.setImageResource(location.getLocationImageId());

        return locationItemView;
    }
}
