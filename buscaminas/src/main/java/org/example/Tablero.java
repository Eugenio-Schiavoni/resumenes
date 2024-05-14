package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tablero {
    private char[][] casillas;
    private Random rand = new Random();

    public Tablero(){
        this.casillas = new char[3][3];
        for(char[] fila : casillas){
            fila[0] = ' ';
            fila[1] = ' ';
            fila[2] = ' ';
        }
    }

    public void dibujarTablero(){
        System.out.println("_____________");
        for(char[] fila : casillas){
            System.out.println("| " + fila[0] + " | " + fila[1] + " | " + fila[2] + " |");
            System.out.println("----+---+----");
        }

    }

    public void ponerMinas(int minas){
        for (int i = 0; i < minas; i++) {
            int fila = rand.nextInt(3);
            int columna = rand.nextInt(3);
            casillas[fila][columna] = 'X';

        }

    }

    public void dibujardisparo(int fila, int columna){
        if(casillas[fila][columna] == 'X'){
            casillas[fila][columna] = 'O';
            System.out.println("Impactoooooooooooo");
        }
        else {
            System.out.println("Aguaaaaaaaaaaaaaa");
        }


    }

    public void setCasillas(char[][] casillas) {
        this.casillas = casillas;
    }
}
