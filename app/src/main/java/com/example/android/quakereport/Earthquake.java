package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by nadja on 25/08/2017.
 */

public class Earthquake {

    private String mPlace;
    private String mTime;
    private String mMagnitude;

    public Earthquake(String magnitude, String place, String time) {
        this.mPlace = place;
        this.mTime = time;
        this.mMagnitude = magnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getTime() {
        return mTime;
    }

    public String getMagnitude() {
        return mMagnitude;
    }
}
