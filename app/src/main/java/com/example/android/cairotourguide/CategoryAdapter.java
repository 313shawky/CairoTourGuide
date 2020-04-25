package com.example.android.cairotourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new CafesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_historical);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shopping);
        } else {
            return mContext.getString(R.string.category_cafes);
        }
    }
}