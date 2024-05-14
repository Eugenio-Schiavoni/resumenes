package org.example;

public class Main {
    public static void main(String[] args) {

       Mazo mazo = new Mazo();
       mazo.mezclarMazo();
       mazo.mostrarMazo();
       System.out.println();
       Juego juego = new Juego();
       juego.repartir();
       juego.mostrarNombre();
       juego.calcularPuntos();
    }
}