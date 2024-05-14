package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tablero tablero = new Tablero();
        for (int i = 0; i < 5; i++) {
            boolean result = false;
            do{
                String jugada = scan.nextLine();
                int fila = Integer.parseInt(jugada.split(" ")[0]);
                int columna = Integer.parseInt(jugada.split(" ")[1]);
                if(tablero.realizarJugadaUser(fila,columna)){
                    result = true;
                };
            }
            while(result == false);


            if(tablero.estaLleno() == true){
                tablero.mostrarTablero();
                char ganador = tablero.definirGanador();
                System.out.println("El ganador es: " + ganador);
                break;
            }
            tablero.realizarJugadaBot();
            tablero.mostrarTablero();
            if(tablero.definirGanador() != ' '){
                char ganador = tablero.definirGanador();
                System.out.println("El ganador es: " + ganador);
                break;
            };

        }

    }
}