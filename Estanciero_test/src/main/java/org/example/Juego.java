package org.example;

public class Juego {
    private Dado dado1;
    private Dado dado2;

    public Juego() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void jugarTurno() {
        int intentos = 1;  // Contador de intentos en caso de dobles
        while (true) {
            int resultado1 = dado1.lanzar();
            int resultado2 = dado2.lanzar();
            System.out.println("Dado 1: " + resultado1 + ", Dado 2: " + resultado2);

            if (resultado1 == resultado2) {
                System.out.println("¡Dobles! Tiras otra vez.");
                intentos++;
                if (intentos > 3) {  // Si saca dobles 3 veces, va a la cárcel
                    System.out.println("¡Dobles tres veces! Vas a la cárcel.");
                    break;
                }
            } else {
                break;  // Termina el turno si no son dobles
            }
        }
    }


}

