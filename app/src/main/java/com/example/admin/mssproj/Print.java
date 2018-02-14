package com.example.admin.mssproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Print extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
    }


    public void increment(View view) {
        //int quantity=3;
        quantity = quantity + 1;

        display(quantity);

    }

    //Decrement the value when - is clicked
    public void decrement(View view) {
        if (quantity > 0) {
            quantity = quantity - 1;
        } else {
            System.out.println("minimum");
        }
        display(quantity);
    }
    /**
     * This method is called when the order button is clicked.
     */
    /*public void submitOrder(View view) {
        // int quantity=2;
        String price="Price : "+ (quantity*5);
        displayMessage(price);
        // display(quantity);
        //displayPrice(quantity*5);
    }

    public void cancel(View view){
        int a=0;
        displayPrice(a);
    }*/

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /*private void displayPrice(int number){
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }*/

    public void onPrinClick(View v) {
        if (v.getId() == R.id.bprin) {
            Toast temp2 = Toast.makeText(Print.this, "Printing...", Toast.LENGTH_SHORT);
            temp2.show();
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

