package com.example.myapplication.modelos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.galeriamodelos.Galeriazapas;

import java.util.ArrayList;

public class galeriaAdidas extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_adidas);

        spinner = findViewById(R.id.spinner);

        ArrayList<MarcasSpinner> marcas = new ArrayList<MarcasSpinner>();
        marcas.add(new MarcasSpinner("Selecione una marca"));
        marcas.add(new MarcasSpinner("Jordan"));
        marcas.add(new MarcasSpinner("Adidas"));
        marcas.add(new MarcasSpinner("Nike"));

        ArrayAdapter<MarcasSpinner> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,marcas);
        spinner.setAdapter(adapter);
        sspinner();

    }

    public void sspinner(){

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1){
                    startActivity(new Intent(galeriaAdidas.this, Galeriazapas.class));
                }else if(i==2){
                    startActivity(new Intent(galeriaAdidas.this, galeriaAdidas.class));
                }else if(i==3){
                    startActivity(new Intent(galeriaAdidas.this, galeriaNike.class));
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}