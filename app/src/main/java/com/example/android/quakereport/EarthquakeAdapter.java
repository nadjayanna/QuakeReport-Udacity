package com.example.android.quakereport;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static java.text.DateFormat.MEDIUM;

/**
 * Created by nadja on 25/08/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param earthquakes   A List of Word objects to display in a list
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        // Get the magnitude from the current Earthquake object and
        // set this text on the magnitude TextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        // Get the place from the current Earthquake object and
        // set this text on the place TextView
        placeTextView.setText(currentEarthquake.getPlace());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);

        String longV = currentEarthquake.getTime();
        long millisecond = Long.parseLong(longV)*1000;
        // or you already have long value of date, use this instead of milliseconds variable.
        String dateString = DateFormat.getMediumDateFormat(getContext()).format(millisecond);

        // Get the time from the current Earthquake object and
        // set this text on the time TextView
        timeTextView.setText(dateString);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
