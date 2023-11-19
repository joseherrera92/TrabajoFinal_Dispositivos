package com.listadapters;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarseActivity extends AppCompatActivity {

    private EditText correo;
    private EditText contrasena;
    private EditText contrasenaConfirmacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        correo = findViewById(R.id.correo);
        contrasena = findViewById(R.id.contrasena);
        contrasenaConfirmacion = findViewById(R.id.contrasenaConfirmacion);
    }

    public void registrarUsuario(View view) {
        if (contrasena.getText().toString().equals(contrasenaConfirmacion.getText().toString())) {
            SharedPreferences preferences = getSharedPreferences("usuarios", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("correo", correo.getText().toString());
            editor.putString("contrasena", contrasena.getText().toString());
            editor.apply();

            Toast.makeText(getApplicationContext(), "Usuario creado.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RegistrarseActivity.this, MainActivity2.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}
