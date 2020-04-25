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
public class HotelsFragment extends Fragment {
    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);
        final ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(R.drawable.steigenberger, getString(R.string.steigenberger),
                getString(R.string.steigenberger_address)));
        destinations.add(new Destination(R.drawable.four_seasons, getString(R.string.four_seasons),
                getString(R.string.four_seasons_address)));
        destinations.add(new Destination(R.drawable.fairmont, getString(R.string.fairmont),
                getString(R.string.fairmont_address)));
        destinations.add(new Destination(R.drawable.conrad, getString(R.string.conrad),
                getString(R.string.conrad_address)));
        destinations.add(new Destination(R.drawable.sheraton, getString(R.string.sheraton),
                getString(R.string.sheraton_address)));
        DestinationAdapter destinationAdapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(destinationAdapter);
        return rootView;
    }
}