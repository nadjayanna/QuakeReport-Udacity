package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by nadja on 27/08/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>>{

    private String mUrl;
    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.mUrl=url;
    }

    @Override
    public List<Earthquake> loadInBackground() {
        
        List<Earthquake> result;

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null || mUrl.isEmpty()) {
            return null;
        }

        result = Utils.fetchEarthquakeData(mUrl);

        return result;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


}
