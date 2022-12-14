package com.example.myapplication.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.PrBar.Comunicacion;
import com.example.myapplication.PrBar.ProgerBarr;
import com.example.myapplication.PrBar.register;
import com.example.myapplication.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements Comunicacion {

    private ImageButton btn_ig;
    private Button btn_registrar;
    private ProgressBar prbar;
    private MaterialButton btnlogin;

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


        /*boton registrar*/
        Button btn_registrar = (Button) findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, register.class));
            }
        });


        /*validacion inicio de sesion*/
        TextView nombreusuario = (TextView) findViewById(R.id.nombreusuario);
        TextView contrasenha = (TextView) findViewById(R.id.pw);
        /*progres bar*/
        prbar = findViewById(R.id.progresbar);
        /*boton*/
        btnlogin = (MaterialButton) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*validacion inicio sesion*/
                new ProgerBarr(MainActivity.this).execute(nombreusuario.getText().toString(),contrasenha.getText().toString(),3000);
            }
        });


        /*redireccion botonxd*/
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





    }

    @Override
    public void toggleProgressBar(Boolean status) {
        if(status){
            prbar.setVisibility(View.VISIBLE);
        }else{
            prbar.setVisibility(View.GONE);
        }
    }

    @Override
    public void lanzarActividad(Class<?> tipoActividad) {
        Intent intent = new Intent(this,tipoActividad);
        startActivity(intent);
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}