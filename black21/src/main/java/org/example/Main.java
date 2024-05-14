package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Bienvenido al Casino De La UTN" );
        System.out.println("--------------------------------");
        System.out.println("------------BlackJack------------");

        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingresa tu nombre de jugador");

        int total = 0;
        Jugador jugador1 = new Jugador();
//        String nombre = scan.nextLine();
        jugador1.setNombre("pepe");



        Dados dado1 = new Dados();
//        System.out.println("Deseas empezar a jugar " +jugador1.getNombre() + "?");

        int opccion = 1;
        if (opccion == 1) {
            System.out.println("Cuantas veces queres tirar los dados " + jugador1.getNombre() + "?");
            int veces = scan.nextInt();

            for(int i = 0; i <= veces; i++ ){
                dado1.tirarDado();
                total += dado1.getValor();
                System.out.println("valor dado: " + dado1.getValor() + "\nValor total: " + total );
            }

        }
        System.out.println("Total puntaje del Humano: " + total);

        Dados dado2 = new Dados();
        Random rand = new Random();
        int ran1 = 0;
        ran1 = rand.nextInt(4);
        total = 0;
        for(int i = 0; i <= ran1 ; i++ ){
            dado2.tirarDado();
            total += dado2.getValor();
            System.out.println("valor dado: " + dado2.getValor() + "\nValor total: " + total );
        }
        System.out.println("Total puntaje de la Maquina: " + total);
        System.out.println("Cantidad de lanzamiento maquina: " + ran1);




    }
}