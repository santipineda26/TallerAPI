package com.sp.tallerapi.modelos;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sp.tallerapi.R;
import com.sp.tallerapi.modelos.Distilleri;
import com.sp.tallerapi.modelos.Whiskey;

import java.util.List;

public class DistilleriAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Distilleri> listDistilleries;

    public DistilleriAdapter(Activity activity, List<Distilleri> listDistilleries) {
        this.activity = activity;
        this.listDistilleries = listDistilleries;
    }

    @Override
    public int getCount() {
        return listDistilleries.size();
    }

    @Override
    public Object getItem(int position) {
        return listDistilleries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View d = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            d = inf.inflate(R.layout.item_distilleri,null);
        }

        Distilleri distilleri = listDistilleries.get(position);
        TextView nombreDestileria = d.findViewById(R.id.txtNombreDes);
        nombreDestileria.setText(distilleri.getNombreDestileria());
        TextView ciudadDestileria = d.findViewById(R.id.txtCiudad);
        ciudadDestileria.setText(distilleri.getCiudadDestileria());
        TextView ratingDestileria = d.findViewById(R.id.txtRating);
        ratingDestileria.setText(distilleri.getRatingDestileria());

        return d;
    }
}
