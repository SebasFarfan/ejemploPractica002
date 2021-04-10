package com.ejemplo.tp2.ejemploPractica.model;

import org.springframework.stereotype.Component;

@Component
public class Libro {
    private int codigo;
    private String isbn;
    private String titulo;
    private int cantPagina;
    private int anioPublicacion;
    private double precio;

    public Libro() {
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantPagina() {
        return this.cantPagina;
    }

    public void setCantPagina(int cantPagina) {
        this.cantPagina = cantPagina;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", cantPagina='" + getCantPagina() + "'" +
            ", anioPublicacion='" + getAnioPublicacion() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }


}
