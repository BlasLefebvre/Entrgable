package com.example.digital.proyectointegrador;

import android.widget.ImageView;

public class Receta {
    private String nombre;
    private String ingredientes;
    private String preparacion;
    private Integer imagenReceta;




    public Receta() {
    }

    public Receta(String nombre, String ingredientes, String preparacion, Integer imagenReceta) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.imagenReceta = imagenReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getImagenReceta() {
        return imagenReceta;
    }

    public void setImagenReceta(Integer imagenReceta) {
        this.imagenReceta = imagenReceta;
    }
}
