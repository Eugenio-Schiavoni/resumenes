package org.example;

public class Propiedad {
    private String nombre;
    private int precioCompra;

    public Propiedad(String nombre, int precioCompra) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }
}

