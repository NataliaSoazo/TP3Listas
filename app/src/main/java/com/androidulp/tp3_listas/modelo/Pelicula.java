package com.androidulp.tp3_listas.modelo;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private int foto;
    private String director;
    private String actor1;
    private String actor2;

    public Pelicula(String titulo, String descripcion, int foto, String director, String actor1, String actor2) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }
}
