package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_ig;
    private Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Splash screen */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_MyApplication);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn_registrar = (Button) findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, register.class));
            }
        });

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


        /*redireccion boton*/
        btn_ig = findViewById(R.id.btn_ig);
        String URL = "https://www.instagram.com/willii_5/";
        btn_ig.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(URL);

                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        /*redireccion boton*/

    }
}