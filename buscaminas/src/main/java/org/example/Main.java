package org.example;

public class Main {
    public static void main(String[] args) {

        Juego game = new Juego();
        game.disparar(1, 1);game.disparar(0, 1);game.disparar(1, 2);
        game.mostrarTablero();
    }
}