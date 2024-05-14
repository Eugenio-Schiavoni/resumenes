package org.example;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.puntos = edad;
    }

    public Jugador(){
        this.nombre = null;
        this.puntos = 0;
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
