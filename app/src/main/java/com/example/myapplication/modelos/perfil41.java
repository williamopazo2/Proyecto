package com.example.myapplication.modelos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.R;

public class perfil41 extends AppCompatActivity {

    private Button buttoncompra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil41);


        /*redireccion boton*/
        buttoncompra = findViewById(R.id.buttoncompra);
        String URL = "https://stockx.com/es-es/air-jordan-4-retro-university-blue";
        buttoncompra.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(URL);

                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });


    }

}