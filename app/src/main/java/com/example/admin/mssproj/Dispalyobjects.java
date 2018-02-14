package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Dispalyobjects extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispalyobjects);

         textView = (TextView) findViewById(R.id.objects);

        String[] Objectdata = {
                "Device ID"+ "  " + "Device Name",
                "  1000    "+ " " + "Lighting control",
                "  1001    "+ " " + "Xerox",
                "  1002    "+ " " + "Projector",
                "  1003    "+ " " + "System Control",
                "  1004    "+ " " + "Main door - 1",
                "  1005    "+ " " + "MAin door - 2",
                "  1006    "+ " " + "Air conditioning unit",
                "  1007    "+ " " + "Vending Machine",





        };
        for (String dummyWeatherDay : Objectdata) {
            textView.append(dummyWeatherDay + "\n\n\n");
        }
    }

    public void onConnectClick(View v) {
        if (v.getId() == R.id.Bconnect) {
            finish();
            Intent i = new Intent(getApplicationContext(), Connectobject.class);
            startActivity(i);
        }
    }



}
