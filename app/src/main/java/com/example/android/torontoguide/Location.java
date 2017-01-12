package com.example.android.torontoguide;

/**
 * Created by Olisp on 1/10/2017.
 */

public class Location {
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationPhone;
    private String mLocationDescription;
    private int mLocationImage;

    public Location(int locationImage, String locationName, String locationAddress, String locationPhone, String locationDescription) {
        mLocationAddress = locationAddress;
        mLocationImage = locationImage;
        mLocationPhone = locationPhone;
        mLocationDescription = locationDescription;
        mLocationName = locationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }
    public String getLocationPhone() {
        return mLocationPhone;
    }
    public String getLocationDescription() {
        return mLocationDescription;
    }
    public String getLocationName() {
        return mLocationName;
    }
    public int getLocationImageId() {
        return mLocationImage;
    }
}
