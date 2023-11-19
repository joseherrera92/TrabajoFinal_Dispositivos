package com.listadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class ListAdapter extends BaseAdapter {
    //para saber donde esta la aplicacion

    Context contexto;
    String [] nombres, mensajes, horaUltimoMensaje, numeroTelefono, pais, estados;

    int[] idImagen;

    LayoutInflater inflater;

    public ListAdapter(Context contexto, String[] nombres, String[] mensajes,
                       String[] horaUltimoMensaje, String[] numeroTelefono, String[] pais, int[] idImagen, String[] estado) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensajes = mensajes;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        this.estados = estado;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    //para saber cuantos datos me llegaron
    public int getCount(){return nombres.length;} //devuelve la cantidad de datos recibidos

    @Override
    //regresar un objeto vacio y recibe la cantidad de datos i
    public Object getItem(int i){return null;}

    @Override
    public long getItemId(int i){return 0;}

    @Override
    // obtener la vista (LA PARTE GRAFICA)
    public View getView(int i, View vista, ViewGroup ViewGroup){
        vista = inflater.inflate(R.layout.list_item,null);
        ImageView fotoPerfil = vista.findViewById(R.id.imagenPerfil);
        TextView nombreUsuario = vista.findViewById(R.id.nombrepresona);
        TextView ultimoMensaje = vista.findViewById(R.id.ultimoMensaje);
        TextView horaMensaje = vista.findViewById(R.id.horamensaje);
        TextView estado = vista.findViewById(R.id.textoEstado);
        fotoPerfil.setImageResource(idImagen[i]);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensajes[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);
        estado.setText(estados[i]);


        return vista;
    }


    /*
    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getMensajes() {
        return mensajes;
    }

    public void setMensajes(String[] mensajes) {
        this.mensajes = mensajes;
    }

    public String[] getHoraUltimoMensaje() {
        return horaUltimoMensaje;
    }

    public void setHoraUltimoMensaje(String[] horaUltimoMensaje) {
        this.horaUltimoMensaje = horaUltimoMensaje;
    }

    public String[] getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String[] numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String[] getPais() {
        return pais;
    }

    public void setPais(String[] pais) {
        this.pais = pais;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

     */
}
