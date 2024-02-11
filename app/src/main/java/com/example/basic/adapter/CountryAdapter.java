package com.example.basic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.basic.R;

import java.util.List;

public class CountryAdapter  extends BaseAdapter {
    private List<Country> list;

    public CountryAdapter(List<Country> list, Context context) {
        this.list = list;
        this.context = context;
    }

    private Context context;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return  list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.country_item, parent, false);
            TextView nameById = convertView.findViewById(R.id.nameSpinner);
            TextView aboutById = convertView.findViewById(R.id.aboutSpinner);
            Country country = list.get(position);
            nameById.setText(country.getName());
            aboutById.setText(country.getAbout());
            return  convertView;
        }else {

            return convertView;
        }
    }
}
