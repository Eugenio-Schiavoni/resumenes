package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> cartas;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.cartas = new ArrayList<>();

    }

    public void agregarCarta(Carta carta){
        cartas.add(carta);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}
