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
public class CafesFragment extends Fragment {
    public CafesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);
        final ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(R.drawable.spectra, getString(R.string.spectra),
                getString(R.string.sheraton_address)));
        destinations.add(new Destination(R.drawable.cilantro, getString(R.string.cilantro),
                getString(R.string.cilantro_address)));
        destinations.add(new Destination(R.drawable.pottery, getString(R.string.pottery),
                getString(R.string.pottery_address)));
        destinations.add(new Destination(R.drawable.beanos, getString(R.string.beanos),
                getString(R.string.beanos_address)));
        destinations.add(new Destination(R.drawable.sufi, getString(R.string.sufi),
                getString(R.string.sufi_address)));
        DestinationAdapter destinationAdapter = new DestinationAdapter(getActivity(), destinations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(destinationAdapter);
        return rootView;
    }
}