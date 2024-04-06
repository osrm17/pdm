package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bEnviar;

    EditText etNombre, etTelefono, etCorreo, etCalle, etNumInt, etNumExt, etCP, etAlcaldia, etEstado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bEnviar = findViewById(R.id.btnEnviar);

    }
}