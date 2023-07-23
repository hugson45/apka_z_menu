package com.example.apka_z_menu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView miasta;
    private TextView hello;
    private Spinner student;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.Ustawienia) {
            Toast.makeText(this, "Wybrales Ustawienia", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.alarm) {
            Toast.makeText(this, "Wybrales Alarm", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miasta = findViewById(R.id.lista);
        student = findViewById(R.id.spinner);
        hello = findViewById(R.id.tekst);
        hello.setText(getString(R.string.hello));


      /*  ArrayList<String> students = new ArrayList<>();
        students.add("Dominik");
        students.add("Marcin");
        students.add("Tomek");
        students.add("Łukasz");
        students.add("Robert");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students
        );
        student.setAdapter(studentsAdapter);
       */

        student.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, student.getSelectedItem().toString() + " Info", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> miejscowosci = new ArrayList<>();
        miejscowosci.add("Poznań");
        miejscowosci.add("Warszawa");
        miejscowosci.add("Wrocław");
        miejscowosci.add("Kraków");
        miejscowosci.add("Gdańsk");

        ArrayAdapter<String> miastaAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                miejscowosci

        );
        miasta.setAdapter(miastaAdapter);
        miasta.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Wybrales " + miejscowosci.get(i), Toast.LENGTH_SHORT).show();

            }
        });
    }
}







