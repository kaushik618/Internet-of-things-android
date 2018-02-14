package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Vendingmachine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendingmachine);
    }

    public void onPayClick(View v) {
        if (v.getId() == R.id.bpay) {
            Toast temp2 = Toast.makeText(Vendingmachine.this,"Authorizing Payment",Toast.LENGTH_SHORT);
            temp2.show();
            Toast temp4 = Toast.makeText(Vendingmachine.this,"Payment Complete, Please Collect item",Toast.LENGTH_SHORT);
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
