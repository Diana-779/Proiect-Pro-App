package com.example.pro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pag2_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2_calculator);
    }
    @SuppressLint("SetTextI18n")
    public void onButtonClick(View view){

        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView rezText = findViewById(R.id.rez);
        int numar1 = Integer.parseInt(el1.getText().toString());
        int numar2 = Integer.parseInt(el2.getText().toString());

        int rezSuma = numar1 +numar2;
        rezText.setText(Integer.toString(rezSuma));

    }
    @SuppressLint("SetTextI18n")
    public void onButtonClick1(View view){
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView rezText = findViewById(R.id.rez);
        int numar1 = Integer.parseInt(el1.getText().toString());
        int numar2 = Integer.parseInt(el2.getText().toString());
        int rezProdus = numar1 * numar2;

        rezText.setText(Integer.toString(rezProdus));

    }
    @SuppressLint("SetTextI18n")
    public void onButtonClick2(View view){
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView rezText = findViewById(R.id.rez);
        int numar1 = Integer.parseInt(el1.getText().toString());
        int numar2 = Integer.parseInt(el2.getText().toString());
        int rezDiferenta = numar1 - numar2;
        rezText.setText(Integer.toString(rezDiferenta));

    }
    @SuppressLint("SetTextI18n")
    public void onButtonClick3(View view){
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView rezText = findViewById(R.id.rez);
        int numar1 = Integer.parseInt(el1.getText().toString());
        int numar2 = Integer.parseInt(el2.getText().toString());
        int rezImpartire = numar1 / numar2;
        rezText.setText(Integer.toString(rezImpartire));

    }
    @SuppressLint("SetTextI18n")
    public void onButtonClick4(View view){
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView rezText = findViewById(R.id.rez);
        int numar1 = Integer.parseInt(el1.getText().toString());
        int numar2 = Integer.parseInt(el2.getText().toString());
        int rezrest = numar1 % numar2;
        rezText.setText(Integer.toString(rezrest));

    }

}