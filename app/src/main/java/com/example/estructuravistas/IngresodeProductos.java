package com.example.estructuravistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresodeProductos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresode_productos);
    }

    public void login(View view) {
        Intent MainAcivity = new Intent(this, MainActivity.class);

        startActivity(MainAcivity);
    }
}