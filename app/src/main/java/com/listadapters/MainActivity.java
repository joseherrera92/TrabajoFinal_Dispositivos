package com.listadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] idImagen = {
                R.drawable.pablo,
                R.drawable.sofia,
                R.drawable.jota,
                R.drawable.susana,
                R.drawable.sara,
                R.drawable.lulu,
                R.drawable.elvia,
                R.drawable.ilduara,
                R.drawable.coco,
        };

        String[] nombre = {
                "Pablo Rivera",
                "Sofia Villarraga",
                "Jota",
                "Susana Gemela",
                "Sara Villarraga",
                "Lulu Giraldo Villarrga",
                "Doña e",
                "HIlduara",
                "Coco"
        };

        String[] ultimoMensaje ={
                "Cada quien interpreta", "Ojala no venga jose hoy","Ando haciendo trabajos","Ahora me das un besito amor?","Gracias por venir ","Cambienme el tomadero de agua porfa", "Ya vi una nube, hoy no abro", "Me voy a dormir ya", "Adivina el personaje"
        };

        String[] horaUltimoMensaje ={
                "1:01", "2:02","3:03","4:44","5:05","6:06","7:07", "8:08", "9:09"
        };
        String[] numeroTelefono ={
                "375 556 58 35", "311 114 14 14","378 776 71 10","378 765 24 31","349 087 65 22","222 222 22 22","390 345 67 89","390 678 45 67", "334 789 65 90"
        };

        String[] pais ={
                "Brazil","Colombia", "Estados Unidos","Colombia","Perú","Alemania","Suiza","Colombia", "Australia"
        };

        String[] estado ={
                "Online","Online", "Offline","Online","Offline","Online","Offline","Online","Online"
        };

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombre,ultimoMensaje,horaUltimoMensaje,numeroTelefono,pais,idImagen,estado);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        //agregar listener para cuando se hace click sobre el item
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                //Agregar el intent
                Intent irAinformacion = new Intent(MainActivity.this,UserActivity.class)
                        .putExtra("nombre",nombre[posicion])
                        .putExtra("mensaje", ultimoMensaje[posicion])
                        .putExtra("hora",horaUltimoMensaje[posicion])
                        .putExtra("telefono",numeroTelefono[posicion])
                        .putExtra("pais",pais[posicion])
                        .putExtra("imagen",idImagen[posicion])
                        .putExtra("estado",estado[posicion]);
                startActivity(irAinformacion);
            }
        });

    }
}