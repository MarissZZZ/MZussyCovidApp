package com.example.covid_19_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class informacija extends AppCompatActivity {

    android.widget.Spinner spinner;
    int currentItem;

    TextView inf, inf1, inf2, inf3, inf4, inf5, inf6, inf7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacija);

        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, MenuData.menuNames));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (currentItem == position) {
                    return; // do nothing
                } else {
                    String item = parent.getItemAtPosition(position).toString();
                    if (parent.getItemAtPosition(position).equals("Covid")) {
                        Intent intent = new Intent(informacija.this, sakumlapa.class);

                        startActivity(intent);
                    }
                    if (parent.getItemAtPosition(position).equals("Lietotnes")) {
                        Intent intent = new Intent(informacija.this, lietotnes.class);

                        startActivity(intent);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

                inf = findViewById(R.id.inf);
                inf1 = findViewById(R.id.inf);
                inf2 = findViewById(R.id.inf);
                inf3 = findViewById(R.id.inf);
                inf4 = findViewById(R.id.inf);
                inf5 = findViewById(R.id.inf);
                inf6= findViewById(R.id.inf);
                inf7 = findViewById(R.id.inf);

        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spkc.gov.lv/lv/aktualitates-par-covid-19"));
                startActivity(i);


            }
        });

        inf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://covid19.gov.lv/covid-19/par-covid-19/simptomi"));
                startActivity(i);


            }
        });

        inf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://covid19.gov.lv/covid-19/par-covid-19"));
                startActivity(i);


            }
        });

        inf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://spkc.maps.arcgis.com/apps/dashboards/4469c1fb01ed43cea6f20743ee7d5939"));
                startActivity(i);


            }
        });

        inf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spkc.gov.lv/lv/jautajumi-un-atbildes-par-covid-19-0"));
                startActivity(i);


            }
        });

        inf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spkc.gov.lv/lv/jautajumi-un-atbildes-par-covid-19-0"));
                startActivity(i);


            }
        });

        inf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://covid19.gov.lv/covid-19/par-covid-19"));
                startActivity(i);


            }
        });

        inf7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spkc.gov.lv/lv/valsts-apmaksatas-covid-19-analizes"));
                startActivity(i);


            }
        });
    }
}