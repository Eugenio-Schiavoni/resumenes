package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Jugador jugadorHumano = new Jugador('X');
        Jugador jugadorMaquina = new Jugador('O');

        boolean turnoHumano = true;

        System.out.println("¡Bienvenido a Tateti!");
        tablero.mostrarTablero();

        while (true) {
            if (turnoHumano) {
                System.out.println("Tu turno. Ingresa fila y columna (0-2): ");
                int fila = scanner.nextInt();
                int columna = scanner.nextInt();
                if (tablero.hacerMovimiento(fila, columna, jugadorHumano.getSímbolo())) {
                    tablero.mostrarTablero();
                    if (tablero.hayGanador(jugadorHumano.getSímbolo())) {
                        System.out.println("¡Ganaste!");
                        break;
                    }
                    turnoHumano = false;
                } else {
                    System.out.println("Movimiento inválido. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Turno de la máquina:");
                int[] movimiento = tablero.obtenerMovimientoMaquina();
                if (movimiento != null) {
                    tablero.hacerMovimiento(movimiento[0], movimiento[1], jugadorMaquina.getSímbolo());
                    tablero.mostrarTablero();
                    if (tablero.hayGanador(jugadorMaquina.getSímbolo())) {
                        System.out.println("La máquina ganó.");
                        break;
                    }
                    turnoHumano = true;
                }
            }

            if (tablero.estaLleno()) {
                System.out.println("Es un empate.");
                break;
            }
        }

        scanner.close();
    }
}
