package com.example.user.taxcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculatePrice(View view) {
        EditText inputPrice = (EditText) findViewById(R.id.enteredPrice); //find the input text
        TextView outputPrice = (TextView) findViewById(R.id.updatedTotal); //find the output textview
        String result = inputPrice.getText().toString(); //convert input text to a strin (from a edittext)

        if (result.length() == 0) {
            Toast toast = Toast.makeText(this, "Please input a price!", Toast.LENGTH_SHORT);
            toast.show();
            ;
        } else {

            double value = Double.parseDouble(result); // convert string to double
            value = value * 1.14975; //calculate the tax
            value = Math.round(value * 100); // those 2 lines are used to round and trunk at 2 digits
            value = value / 100; //see above line
            String finalOutput = String.valueOf(value); //convert double to string
            outputPrice.setText(finalOutput);//output a string with the total cost
        }


    }

}
//This was my first app on it's own
