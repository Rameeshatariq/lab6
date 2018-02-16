package com.example.meesh.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView)findViewById(R.id.listview);
        ArrayList<DataModel> list= new ArrayList<>();
        list.add(new DataModel("Rameesha", "Hello Everyone", "05:00 AM"));
        list.add(new DataModel("Nimra", "Hello Everyone", "04:00 AM"));
        list.add(new DataModel("Sara", "Hello Everyone", "03:00 AM"));
        list.add(new DataModel("Maham", "kaisi ho?", "12:00 AM"));


        customAdapter adp =new customAdapter(this,R.layout.customlistview,list);
        listview.setAdapter(adp);
    }
}
