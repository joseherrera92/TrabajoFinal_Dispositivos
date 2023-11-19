package com.listadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity {

    String nombre,mensaje,hora,telefono,pais, estado;
    TextView textoNombre, textoMensaje,textoHora,textoTelefono,textoPais, textoEstado;
    int imagen;
    CircleImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textoNombre = findViewById(R.id.textoNombre);
        textoMensaje = findViewById(R.id.textoMensaje);
        textoTelefono = findViewById(R.id.telefono);
        textoPais = findViewById(R.id.pais);
        image = findViewById(R.id.imagen);
        textoEstado = findViewById(R.id.textoEstado);

        Intent datos = this.getIntent();
        if(datos != null){
            nombre = datos.getStringExtra("nombre");
            mensaje = datos.getStringExtra("mensaje");
            hora = datos.getStringExtra("hora");
            telefono = datos.getStringExtra("telefono");
            pais = datos.getStringExtra("pais");
            imagen = datos.getIntExtra("imagen",R.drawable.jota);
            estado = datos.getStringExtra("estado");


            textoPais.setText(pais);
            textoNombre.setText(nombre);
            textoTelefono.setText(telefono);
            textoMensaje.setText(mensaje);
            image.setImageResource(imagen);
            textoEstado.setText(estado);
        }

    }
}


