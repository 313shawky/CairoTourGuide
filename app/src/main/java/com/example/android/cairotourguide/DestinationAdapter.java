package com.example.android.cairotourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DestinationAdapter extends ArrayAdapter<Destination> {
    public DestinationAdapter(Activity context, ArrayList<Destination> destinations) {
        super(context, 0, destinations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Destination currentDestination = getItem(position);
        if (currentDestination != null) {
            ImageView destinationImage = listItemView.findViewById(R.id.image);
            destinationImage.setImageResource(currentDestination.getImageResourceId());
            TextView destinationName = listItemView.findViewById(R.id.name);
            destinationName.setText(currentDestination.getDestinationName());
            TextView destinationAddress = listItemView.findViewById(R.id.address);
            destinationAddress.setText(currentDestination.getDestinationAddress());
        }
        return listItemView;
    }
}