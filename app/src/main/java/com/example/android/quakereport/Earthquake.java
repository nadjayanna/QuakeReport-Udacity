package com.example.android.quakereport;

/**
 * Created by nadja on 25/08/2017.
 */

public class Earthquake {

    private String mLocation;
    private long mTimeMilliseconds;
    private double mMagnitude;
    private String mUrl;

    public Earthquake(double magnitude, String location, long time, String url) {
        this.mLocation = location;
        this.mTimeMilliseconds = time;
        this.mMagnitude = magnitude;
        this.mUrl = url;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeMilliseconds() {
        return mTimeMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl() { return mUrl; }
}
