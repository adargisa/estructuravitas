package com.example.estructuravistas;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProductoActivity extends AppCompatActivity {

    String user_recibe,pass_recibe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        Intent intent = getIntent();

        user_recibe = intent.getStringExtra("usuario");
        pass_recibe = intent.getStringExtra("contraseña");

        Toast.makeText(this, "Bienvenido"+ user_recibe, Toast.LENGTH_SHORT).show();
    }

    public void accederIngreso(View view) {
        Intent IngresoProducto = new Intent(this, IngresodeProductos.class);

        startActivity(IngresoProducto);
    }
}