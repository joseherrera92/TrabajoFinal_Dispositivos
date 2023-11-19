package com.listadapters;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesionActivity extends AppCompatActivity {

    private EditText correo;
    private EditText contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        correo = findViewById(R.id.correo);
        contrasena = findViewById(R.id.contrasena);

        correo.setText("correo_prueba@example.com");
        contrasena.setText("contrasena_prueba");
    }

    public void iniciarSesion(View view) {
        String correoIngresado = correo.getText().toString();
        String contrasenaIngresada = contrasena.getText().toString();

        if (correoIngresado.equals("correo_prueba@example.com") && contrasenaIngresada.equals("contrasena_prueba")) {
            Toast.makeText(getApplicationContext(), "Datos de prueba válidos.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Datos de prueba incorrectos.", Toast.LENGTH_SHORT).show();
        }
    }
}
