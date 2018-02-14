package com.example.admin.mssproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Projector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projector);
    }

    public void onOnClick(View v) {
        if (v.getId() == R.id.bprojon) {
            Toast temp2 = Toast.makeText(Projector.this, "Turning On", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }

    public void onOffClick(View v) {
        if (v.getId() == R.id.bprojoff) {
            Toast temp2 = Toast.makeText(Projector.this, "Turning Off", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }
}
