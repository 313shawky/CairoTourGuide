package com.example.android.cairotourguide;

public class Destination {
    private int mImageResourceId;
    private String mDestinationName;
    private String mDestinationAddress;

    public Destination(int imageResourceId, String destinationName, String destinationAddress) {
        mImageResourceId = imageResourceId;
        mDestinationName = destinationName;
        mDestinationAddress = destinationAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDestinationName() {
        return mDestinationName;
    }

    public String getDestinationAddress() {
        return mDestinationAddress;
    }
}