package org.example;

import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera {

    public static void main (String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Elija una opccion: \n1. Piedra\n2. Papel\n3. Tijera");
        String eleccionHumano = scan.nextLine();
        while (!eleccionHumano.equals("piedra") && !eleccionHumano.equals("papel") && !eleccionHumano.equals("tijera") ){
            System.out.println("Debe ingresar piedra, papel o tijera!");
            System.out.println("Elija una opccion: \n1. Piedra\n2. Papel\n3. Tijera");
            eleccionHumano = scan.nextLine();
        }
        String eleccionBot = obtenerEleccionBot();

        String ganador = determinarGanador(eleccionBot, eleccionHumano);
        System.out.println("El ganador es: " + ganador);

    }

    public static String obtenerEleccionBot(){
        String eleccion = "";
        Random  rand = new Random();
        int numero_rand = (rand.nextInt(3) + 1);
        switch(numero_rand) {
            case 1:
                eleccion = "piedra";
                break;
            case 2:
                eleccion = "papel";
                break;
            case 3:
                eleccion = "tijera";
                break;
        }
        return eleccion;
    }

    public static String determinarGanador(String eleccionBot, String eleccionHumano){
        String ganador = "";
        if(eleccionBot.equals(eleccionHumano)){
            ganador = "Empate";
        } else if (eleccionBot.equals("piedra") && eleccionHumano.equals("papel")) {
            ganador = "Humano";

        }
        else if (eleccionBot.equals("piedra") && eleccionHumano.equals("tijera")) {
            ganador = "Bot";

        }
        else if (eleccionBot.equals("tijera") && eleccionHumano.equals("papel")) {
            ganador = "Bot";

        }
        else if (eleccionBot.equals("tijera") && eleccionHumano.equals("piedra")) {
            ganador = "Humano";

        }
        else if (eleccionBot.equals("papel") && eleccionHumano.equals("piedra")) {
            ganador = "Bot";

        }
        else if (eleccionBot.equals("papel") && eleccionHumano.equals("tijera")) {
            ganador = "Humano";

        }
        return ganador;
    }


}
