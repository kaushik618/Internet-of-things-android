package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OpenClose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_close);

    }

    public void onOpenClick(View v) {
        if (v.getId() == R.id.button8) {
            Toast temp2 = Toast.makeText(OpenClose.this, "Opening Door...", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }
    public void onCloseClick(View v) {
        if (v.getId() == R.id.button9) {
            Toast temp4 = Toast.makeText(OpenClose.this, "Closing Door...", Toast.LENGTH_SHORT);
            temp4.show();
        }
    }
    public void onBackClick(View v) {
        if (v.getId() == R.id.bback) {
            finish();
            Intent i = new Intent(getApplicationContext(), Connectobject.class);
            startActivity(i);

        }
    }
}

