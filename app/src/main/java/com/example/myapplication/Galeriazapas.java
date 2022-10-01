package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class Galeriazapas extends AppCompatActivity {

    Spinner spinner;
    Button Btn1;
    Button Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeriazapas);

        setContentView(R.layout.activity_galeriazapas);
        spinner = findViewById(R.id.spinner);

        ArrayList<Marcas> marcas = new ArrayList<Marcas>();
        marcas.add(new Marcas("Selecione una marca"));
        marcas.add(new Marcas("jordan"));
        marcas.add(new Marcas("Adidas"));


        ArrayAdapter<Marcas> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,marcas);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        Btn1 = (Button) findViewById(R.id.Btn1);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Galeriazapas.this, perfil41.class));
            }
        });

        Btn2 = (Button) findViewById(R.id.Btn2);

        Btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Galeriazapas.this, perfiljordan4jbalvin.class));
            }
        });
    }
}