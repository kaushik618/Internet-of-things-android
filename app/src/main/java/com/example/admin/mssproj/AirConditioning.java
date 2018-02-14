package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class AirConditioning extends AppCompatActivity {
    private static SeekBar seek_bar;
    private static SeekBar seek_bar1;
    private static TextView text_view;
    private static TextView text_view2;
    private static TextView text_view3;
    private static TextView text_view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_conditioning);
    }

    public void onOnClick(View v) {
        if (v.getId() == R.id.bair1) {
            Toast temp2 = Toast.makeText(AirConditioning.this, "Turning ON...", Toast.LENGTH_SHORT);
            temp2.show();
        }
    }

    public void onOffClick(View v) {
        if (v.getId() == R.id.bair2) {
            Toast temp4 = Toast.makeText(AirConditioning.this, "Turning OFF...", Toast.LENGTH_SHORT);
            temp4.show();
        }

    }

    public void seebbarr() {
        seek_bar = (SeekBar) findViewById(R.id.seekBar);
        text_view = (TextView) findViewById(R.id.textView);
        text_view2 = (TextView) findViewById(R.id.textView2);
        text_view.setText("Temperature : " + seek_bar.getProgress() + " / " + seek_bar.getMax());

        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText("Fan : " + progress + " / " + seek_bar.getMax());
                        Toast.makeText(AirConditioning.this, "SeekBar in progress", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(AirConditioning.this, "Fan Speed ", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Fan Speed : " + progress_value + " / " + seek_bar.getMax());
                        Toast.makeText(AirConditioning.this, "SeekBar in StopTracking", Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }


    public void seebbbarr() {
        seek_bar1 = (SeekBar) findViewById(R.id.seekBar);
        text_view3 = (TextView) findViewById(R.id.textView3);
        text_view4 = (TextView) findViewById(R.id.textView4);
        text_view.setText("Fan Speed: " + seek_bar.getProgress() + " / " + seek_bar.getMax());

        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText("Temperature : " + progress + " / " + seek_bar.getMax());
                        Toast.makeText(AirConditioning.this, "SeekBar in progress", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(AirConditioning.this, "Increasing contrast", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Temperature : " + progress_value + " / " + seek_bar.getMax());
                        Toast.makeText(AirConditioning.this, "SeekBar in StopTracking", Toast.LENGTH_SHORT).show();
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
