package com.example.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText valueIn = findViewById(R.id.editText);

        Button fahrenheit = findViewById(R.id.f_button);
        fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText valueIn = findViewById(R.id.editText);
                int value = Integer.parseInt(valueIn.getText().toString());

                TextView sum_temp = findViewById(R.id.textView);

                int tempCel = (value-32)*5/9;
                String sum_st = String.valueOf(tempCel);
                sum_temp.setText(sum_st);

            }
            });

        Button celsius = findViewById(R.id.c_button);
        celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText valueIn = findViewById(R.id.editText);
                int value = Integer.parseInt(valueIn.getText().toString());

                TextView sum_temp = findViewById(R.id.textView);

                int tempFah = (value*9/5)+32;
                String sum_st = String.valueOf(tempFah);
                sum_temp.setText(sum_st);

            }
        });

    }

}
