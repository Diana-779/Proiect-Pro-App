package com.example.pro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button1=(Button)findViewById(R.id.button1);
        button3=(Button) findViewById(R.id.button3);
       button1.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent = new Intent(".pag2_calculator");
                       startActivity(intent);
                   }
               });

       button3.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent = new Intent(".pag3_varsta");
                       startActivity(intent);
                   }
               });
    }



}