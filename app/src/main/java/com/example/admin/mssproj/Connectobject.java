package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class Connectobject extends AppCompatActivity {

    public int count=0;
    public int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectobject);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.logout:
                finish();
                Intent i = new Intent(Connectobject.this, ProfileActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onObjectClick(View v) {
        if (v.getId() == R.id.blight) {
            finish();
            Intent i = new Intent(getApplicationContext(), Light.class);
            startActivity(i);
        }
    }

    public void onDooorClick(View view) {
        if (view.getId() == R.id.bdoor1 ) {
            finish();
            Intent i = new Intent(getApplicationContext(), OpenClose.class);
            startActivity(i);
        }
    }

    public void onDoooorClick(View v) {
        if (v.getId() == R.id.bdoor2 ) {
            finish();
            Intent i = new Intent(getApplicationContext(), OpenClose.class);
            startActivity(i);
        }
    }

    public void onAcClick(View view) {
        if (view.getId() == R.id.bAC) {
            finish();
            Intent i = new Intent(getApplicationContext(), AirConditioning.class);
            startActivity(i);
        }
    }

    public void onPrintClick(View view) {
        if (view.getId() == R.id.bprinter) {
            finish();
            Intent i = new Intent(getApplicationContext(), Print.class);
            startActivity(i);
        }
    }

    public void onProClick(View view) {
        if (view.getId() == R.id.bprojec) {
            count++;
            if (count == 1) {
                Toast temp2 = Toast.makeText(Connectobject.this, "Access Denied, Please Contact administrator", Toast.LENGTH_SHORT);
                temp2.show();
            } else {
                Intent i = new Intent(getApplicationContext(), Projector.class);
                startActivity(i);
            }
        }
    }
    public void onSysClick(View view) {
        if (view.getId() == R.id.bsystem) {
            c++;
            if (c == 1) {
                Toast temp2 = Toast.makeText(Connectobject.this, "Access Denied, Please Contact administrator", Toast.LENGTH_SHORT);
                temp2.show();
            } else {
                Intent i = new Intent(getApplicationContext(), Syst.class);
                startActivity(i);
            }
        }
    }

    public void onFoodClick(View view) {
        if (view.getId() == R.id.bfood) {
            finish();
            Intent i = new Intent(getApplicationContext(), Vendingmachine.class);
            startActivity(i);
        }
    }
}







