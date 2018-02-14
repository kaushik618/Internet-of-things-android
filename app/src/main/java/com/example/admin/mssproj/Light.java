package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Light extends AppCompatActivity {
    private static SeekBar seek_bar;
    private static TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
    }

    public void onOnClick(View v) {
        if (v.getId() == R.id.blight1) {
            Toast temp2 = Toast.makeText(Light.this, "Turning ON...", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }

    public void onOffClick(View v) {
        if (v.getId() == R.id.blight2) {
            Toast temp4 = Toast.makeText(Light.this, "Turning OFF...", Toast.LENGTH_SHORT);
            temp4.show();
        }

    }

    public void seebbarr() {
        seek_bar = (SeekBar) findViewById(R.id.seekBar);
        text_view = (TextView) findViewById(R.id.textView);
        text_view.setText("Dimming : " + seek_bar.getProgress() + " / " + seek_bar.getMax());

        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText("Dimming : " + progress + " / " + seek_bar.getMax());
                        Toast.makeText(Light.this, "SeekBar in progress", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(Light.this, "Increasing contrast", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Covered : " + progress_value + " / " + seek_bar.getMax());
                        Toast.makeText(Light.this, "SeekBar in StopTracking", Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }
    public void onBackClick(View v) {
        if (v.getId() == R.id.bback) {
            finish();
            Intent i = new Intent(getApplicationContext(), Connectobject.class);
            startActivity(i);
        }
    }
}