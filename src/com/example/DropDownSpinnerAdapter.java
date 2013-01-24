package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DropDownSpinnerAdapter extends ArrayAdapter<String> {

    String[] items;
    private LayoutInflater layoutInflater;

    public DropDownSpinnerAdapter(Context context, int textViewResourceId, String[] objects) {
        super(context, textViewResourceId, objects);
        this.items = objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public void setNotifyOnChange(boolean notifyOnChange) {
        super.setNotifyOnChange(notifyOnChange);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        View row = layoutInflater.inflate(R.layout.drop_down_spinner, parent, false);
        TextView textItem = (TextView) row.findViewById(R.id.text_item);
        textItem.setText(getItem(position));
//        if (position < mNameList.length) {
//            String cateName = mNameList[position];
//            spinnerText.setText(cateName);
//        }
        return row;
    }
}
