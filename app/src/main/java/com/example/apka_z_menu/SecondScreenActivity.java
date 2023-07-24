package com.example.apka_z_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class SecondScreenActivity extends AppCompatActivity {

    public Button cofnij;
    public FloatingActionButton button;
    public ConstraintLayout parent;

    public void showSnackbar() {
        Snackbar.make(parent, "This is a snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Ponów", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SecondScreenActivity.this, "Ponowiles", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setTextColor(Color.YELLOW)
                .show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);


        button = findViewById(R.id.button);
        parent = findViewById(R.id.parent);
        cofnij = findViewById(R.id.cofnij);


        cofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cofnij = new Intent(SecondScreenActivity.this, MainActivity.class);
                startActivity(cofnij);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });


    }


}