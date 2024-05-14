package org.example;

public class Tablero {
    private char[][] tablero;
    private final int tamaño = 3;

    public Tablero() {
        tablero = new char[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public boolean hacerMovimiento(int fila, int columna, char jugador) {
        if (fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño && tablero[fila][columna] == '-') {
            tablero[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    public void mostrarTablero() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean hayGanador(char jugador) {
        for (int i = 0; i < tamaño; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }
        for (int i = 0; i < tamaño; i++) {
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        return false;
    }

    public boolean estaLleno() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public char[][] getTablero() {
        return tablero;
    }

    public int[] obtenerMovimientoMaquina() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (tablero[i][j] == '-') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

