package com.example.android.relationproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] relation;
    private final Integer[] imageId;

    public NewList(Activity context, String[] name, String[] relation, Integer[] imageId) {
        super(context, R.layout.list_main, name);
        this.context = context;
        this.relation = relation;
        this.name = name;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_main, null, true);

        TextView txtname = (TextView) rowView.findViewById(R.id.tv1);
        TextView txtrelation = (TextView) rowView.findViewById(R.id.tv2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.iv);

        txtname.setText(name[position]);
        txtrelation.setText(relation[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}