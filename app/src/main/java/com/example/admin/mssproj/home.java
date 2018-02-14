package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



    public void onDiscoverClick(View v) {
        if (v.getId() == R.id.Bdiscover) {
            Toast temp2 = Toast.makeText(home.this,"Surveying Nearby Objects...",Toast.LENGTH_SHORT);
            temp2.show();
            Toast temp4 = Toast.makeText(home.this,"Objects Discovered...",Toast.LENGTH_SHORT);
            temp4.show();

       }
    }

    public void onDisplayClick(View v) {
        if (v.getId() == R.id.Bdisplay) {
            finish();
            Intent i = new Intent(getApplicationContext(), Dispalyobjects.class);
            startActivity(i);
        }
    }
}

