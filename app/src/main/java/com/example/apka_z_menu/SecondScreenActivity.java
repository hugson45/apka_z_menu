package com.example.apka_z_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;


public class SecondScreenActivity extends AppCompatActivity {

    public Button cofnij;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        cofnij = findViewById(R.id.cofnij);

        cofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cofnij = new Intent(SecondScreenActivity.this,MainActivity.class);
                startActivity(cofnij);
            }
        });


    }
}