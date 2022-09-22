package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nombreusuario = (TextView) findViewById(R.id.nombreusuario);
        TextView contrasenha = (TextView) findViewById(R.id.pw);

        MaterialButton btnlogin = (MaterialButton) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nombreusuario.getText().toString().equals("admin") && contrasenha.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Sesion Iniciada", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Galeriazapas.class));
                }else{
                    Toast.makeText(MainActivity.this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}