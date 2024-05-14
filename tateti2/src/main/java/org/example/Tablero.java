package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tablero {
    private char[][] casillas;

    public Tablero(){
        casillas = new char[3][3];
        for(char[] fila : casillas){
            Arrays.fill(fila, ' ');
        }
    }

    public void mostrarTablero() {
        System.out.println("---+---+---");
        for (char[] fila : casillas) {
            System.out.println(" " + fila[0] + " | " + fila[1] + " | " + fila[2]);
            System.out.println("---+---+---");
        }
    }

    public boolean realizarJugadaUser(int fila, int columna){
        char caracter = 'X';
        if( casillas[fila][columna] != ' '){
            System.out.println("Casilla Ocupada");
            return false;
        }
        casillas[fila][columna] = caracter;
        return true;
    }

    public boolean estaLleno(){

        for(char[] fila : casillas){
            if(fila[0] == ' ' || fila[1] == ' ' || fila[2] == ' '){
                return false;
            }

        }
        return true;
    }
    public boolean realizarJugadaBot(){
        boolean estaDisponible = false;
        while(estaDisponible != true){
            Random rand = new Random();
            int fila = rand.nextInt(3);
            int columna = rand.nextInt(3);
            char caracter = 'O';
            if( casillas[fila][columna] != ' '){
                System.out.println("Casilla Ocupada");
                estaDisponible = false;
            }
            else{
                casillas[fila][columna] = caracter;
                estaDisponible = true;

            }
        }
        return estaDisponible;

    }


    public char[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(char[][] casillas) {
        this.casillas = casillas;
    }

    public char definirGanador() {
        char ganador = ' ';
        for(char[] fila : casillas){
            if(fila[0] == fila[1] && fila[0] == fila[2]  ){
                ganador = fila[0];
            }
        }
        for (int j = 0; j < casillas.length; j++) {
            if(casillas[0][j] == casillas[1][j] && casillas[0][j] == casillas[2][j]){
                ganador = casillas[0][j];

            }

        }
        if(ganador != ' '){
            return ganador;
        }
        return ganador;
    }
}
