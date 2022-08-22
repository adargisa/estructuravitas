package com.example.estructuravistas;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText contraseña;
    String usuario_cadena,contraseña_cadena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.Password);

        usuario_cadena = usuario.getText().toString();
        contraseña_cadena = contraseña.getText().toString();

        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validacionusuario(usuario);

            }
        });
        private boolean validacionUsuario(EditText usuario){
            String usuarioImput = usuario.getText().toString();

            if (usuarioImput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(usuarioImput).matches()) {
                Toast.makeText(this, "Validación Correcta", Toast.LENGTH_SHORT).show();
                return true;
            }else{
                Toast.makeText(this,"Validación Incorrecta", Toast.LENGTH_SHORT).show();
                return false;

            }
        }
    }

    public void accederProducto(View view) {
        Intent ProductoActivity = new Intent(this,ProductoActivity.class);

        ProductoActivity.putExtra("usuario",usuario_cadena);
        ProductoActivity.putExtra("contraseña",contraseña_cadena);
        startActivity(ProductoActivity);



    }



    }
