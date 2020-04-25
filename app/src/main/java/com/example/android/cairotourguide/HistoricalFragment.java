package com.example.android.cairotourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {
    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);
        final ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(R.drawable.pyramids_of_giza, getString(R.string.giza_pyramids),
                getString(R.string.giza_pyramids_address)));
        destinations.add(new Destination(R.drawable.cairo_tower, getString(R.string.cairo_tower),
                getString(R.string.cairo_tower_address)));
        destinations.add(new Destination(R.drawable.egyptian_museum, getString(R.string.egyptian_museum),
                getString(R.string.egyptian_museum_address)));
        destinations.add(new Destination(R.drawable.al_azhar_mosque, getString(R.string.al_azhar_mosque),
                getString(R.string.al_azhar_mosque_address)));
        destinations.add(new Destination(R.drawable.coptic_museum, getString(R.string.coptic_museum),
                getString(R.string.coptic_museum_address)));
        DestinationAdapter destinationAdapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(destinationAdapter);
        return rootView;
    }
}