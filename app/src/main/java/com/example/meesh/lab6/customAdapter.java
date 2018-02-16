package com.example.meesh.lab6;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by meesh on 2/15/2018.
 */

public class customAdapter extends ArrayAdapter<DataModel> {
    public static LayoutInflater layoutInflater=null;

    static class viewHolder{
        TextView uname;
        TextView umsg;
        TextView time;
    }

    public customAdapter(@NonNull Context context, int resource, @NonNull ArrayList<DataModel> objects) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder viewHolder = new viewHolder();
        DataModel data = getItem(position);
        View rowView;
        rowView= layoutInflater.inflate(R.layout.customlistview,null);
        viewHolder.uname=(TextView)rowView.findViewById(R.id.uname);
        viewHolder.umsg=(TextView)rowView.findViewById(R.id.msg);
        viewHolder.time=(TextView)rowView.findViewById(R.id.time);
        viewHolder.uname.setText(data.getUname());
        viewHolder.umsg.setText(data.getUmsg());
        viewHolder.time.setText(data.getTime());

        return rowView;
    }
}