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
public class ShoppingFragment extends Fragment {
    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);
        final ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(R.drawable.porto_cairo, getString(R.string.porto_cairo),
                getString(R.string.porto_cairo_address)));
        destinations.add(new Destination(R.drawable.arkadia, getString(R.string.arkadia),
                getString(R.string.arkadia_address)));
        destinations.add(new Destination(R.drawable.citystars, getString(R.string.citystars),
                getString(R.string.citystars_address)));
        destinations.add(new Destination(R.drawable.genena, getString(R.string.genena),
                getString(R.string.genena_address)));
        destinations.add(new Destination(R.drawable.cairo_festival_city, getString(R.string.cairo_festival_city),
                getString(R.string.cairo_festival_city_address)));
        DestinationAdapter destinationAdapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(destinationAdapter);
        return rootView;
    }
}