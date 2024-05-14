package org.example;

import java.util.Random;
import java.util.Scanner;

public class tateti {

    public static void main(String [] args){

         Scanner scan = new Scanner(System.in);
//
//        int pos_x = scan.nextInt();
//        int pos_y = scan.nextInt();


//        System.out.println(pos_x + "" + pos_y);
//
//        tablero[pos_x][pos_y] = "X";
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
//
//        for (int i = 0; i < tablero.length; i++) {
//            for (int j = 0; j < tablero[i].length; j++) {
//                System.out.print(tablero[i][j] + " ");
//            }
//            System.out.println(); // Salto de línea después de cada fila
//        }

        tableroTateti tablero = new tableroTateti();
        tablero.cargarTablero();
        tablero.imprimirTablero();
        System.out.println();
//        System.out.println("Iingresa un numero: ");
//        String numero = scan.nextLine();
//        System.out.println(tablero.verificarLibre(numero));
        Random rand = new Random();
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|X|");
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|O|");
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|X|");
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|O|");
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|X|");
//        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|O|");

        tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|X|");
        for (int i = 0; i < 4; i++) {


            boolean estado = false;
            do{
                int fila = scan.nextInt() -1;
                int columna = scan.nextInt() -1;
                estado = tablero.colocarFichas(fila, columna,"|X|");
            }
            while(estado == false);
            estado = false;

            while(estado == false){
                estado = tablero.colocarFichas(rand.nextInt(3), rand.nextInt(3),"|O|");
            }
        }

        tablero.imprimirTablero();





    }
}
