package com.example.admin.mssproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Syst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syst);
    }
    public void onOnClick(View v) {
        if (v.getId() == R.id.bsyson) {
            Toast temp2 = Toast.makeText(Syst.this, "Turning On", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }

    public void onOffClick(View v) {
        if (v.getId() == R.id.bsysoff) {
            Toast temp2 = Toast.makeText(Syst.this, "Turning Off", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }
}
