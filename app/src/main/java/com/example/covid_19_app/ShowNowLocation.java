package com.example.covid_19_app;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowNowLocation extends AppCompatActivity {


    ListView lv_savedlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_now_location);

        lv_savedlocation = findViewById(R.id.lv_wayPoints);

        MyApplication myApplication = (MyApplication)getApplicationContext();
        List<Location> savedLocation = myApplication.getMyLocation();

        lv_savedlocation.setAdapter(new ArrayAdapter<Location>( this, android.R.layout.simple_list_item_1, savedLocation));
    }
}