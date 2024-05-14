package org.example;

import java.util.Random;
import java.util.Scanner;

public class EstancieroGame {
    private static final int NUM_CASILLEROS = 40;
    private static final int DINERO_INICIAL = 15000;
    private static final int DINERO_SALIDA = 5000;
    private static final int DINERO_COMISARIA = 1000;

    private static final String[] CASILLEROS = {
            "Salida", "Casillero 1", "Casillero 2", "Casillero 3", // Añadir los nombres de los casilleros según tu juego
            // ...
            "Casillero 40"
    };

    private static int[] posicionesJugadores;
    private static int[] dineroJugadores;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego Estanciero!");

        // Inicializar jugadores
        System.out.print("¿Cuántos jugadores van a jugar? ");
        int numJugadores = scanner.nextInt();
        posicionesJugadores = new int[numJugadores];
        dineroJugadores = new int[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            posicionesJugadores[i] = 0;
            dineroJugadores[i] = DINERO_INICIAL;
        }

        // Empezar juego
        Random random = new Random();
        int jugadorActual = 0;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("\nTurno del Jugador " + (jugadorActual + 1));
            System.out.println("Posición actual: " + CASILLEROS[posicionesJugadores[jugadorActual]]);
            System.out.println("Dinero actual: $" + dineroJugadores[jugadorActual]);

            // Simular lanzamiento de dados
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int totalDados = dado1 + dado2;
            System.out.println("Dados: " + dado1 + " y " + dado2 + ". Avanzas " + totalDados + " casillas.");

            // Mover jugador
            posicionesJugadores[jugadorActual] = (posicionesJugadores[jugadorActual] + totalDados) % NUM_CASILLEROS;
            System.out.println("Nueva posición: " + CASILLEROS[posicionesJugadores[jugadorActual]]);

            // Realizar acción del casillero
            realizarAccionCasillero(jugadorActual);

            // Cambiar al siguiente jugador
            jugadorActual = (jugadorActual + 1) % numJugadores;

            // Verificar condiciones de fin de juego
            // Aquí puedes agregar tus condiciones específicas de finalización del juego
            // Por ejemplo, un jugador alcanza cierta cantidad de dinero, etc.
        }

        // Aquí puedes agregar la lógica para determinar al ganador y mostrar los resultados finales
    }

    private static void realizarAccionCasillero(int jugador) {
        // Aquí puedes implementar la lógica para realizar acciones según el tipo de casillero en el que caiga el jugador
        // Por ejemplo, pagar alquiler, comprar propiedades, etc.
        // Puedes utilizar switch-case o métodos separados para cada tipo de casillero
        // Este es solo un ejemplo básico
        switch (posicionesJugadores[jugador]) {
            case 0: // Salida
                System.out.println("Has pasado por la salida. ¡Recibes $" + DINERO_SALIDA + "!");
                dineroJugadores[jugador] += DINERO_SALIDA;
                break;
            case 10: // Comisaría
                System.out.println("Has caído en la comisaría. Debes pagar $" + DINERO_COMISARIA + " o usar una tarjeta de Suerte o Destino.");
                dineroJugadores[jugador] -= DINERO_COMISARIA;
                break;
            // Agrega más casos para otros tipos de casilleros
            default:
                System.out.println("Has caído en un casillero normal.");
                // Agrega lógica para otros tipos de casilleros
                break;
        }
    }
}
