package com.example.kraikar.customlistviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kraikar on 12/31/2016.
 */

public class CustomListViewAdaptor extends ArrayAdapter<String> {

    public CustomListViewAdaptor(Context context, String[] fruits) {
        super(context, R.layout.custom_row, fruits);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater customListViewInflater = LayoutInflater.from(getContext());
        View customRowView = customListViewInflater.inflate(R.layout.custom_row, parent, false);

        String singleFruitItem = getItem(position);
        TextView textViewFruit = (TextView) customRowView.findViewById(R.id.textViewFruit);
        ImageView imageViewPicture = (ImageView) customRowView.findViewById(R.id.imageViewPicture);

        textViewFruit.setText(singleFruitItem);
        imageViewPicture.setImageResource(R.drawable.k);
        return customRowView;
    }
}
