package com.sp.tallerapi.modelos;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sp.tallerapi.R;
import com.sp.tallerapi.modelos.Whiskey;

import java.util.List;

public class WhiskeyAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Whiskey> listWhiskeys;

    public WhiskeyAdapter(Activity activity, List<Whiskey> listWhiskeys) {
        this.activity = activity;
        this.listWhiskeys = listWhiskeys;
    }

    @Override
    public int getCount() {
        return listWhiskeys.size();
    }

    @Override
    public Object getItem(int position) {
        return listWhiskeys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_whiskey,null);
        }

        Whiskey whiskey = listWhiskeys.get(position);
        TextView nombreWhiskey = v.findViewById(R.id.txtName);
        nombreWhiskey.setText(whiskey.getNombreWhiskey());

        TextView monedaWhiskey = v.findViewById(R.id.txtMoneda);
        monedaWhiskey.setText(whiskey.getMonedaWhiskey());

        TextView urlWhiskey = v.findViewById(R.id.txtUrl);
        urlWhiskey.setText(whiskey.getUrlWhiskey());
        return v;
    }
}
