package org.example;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private Mazo mazo;
    private Jugador user;
    private Jugador bot;

    public Juego(){
        this.mazo = new Mazo();
        mazo.mezclarMazo();
        this.user = new Jugador("Usuario");
        this.bot = new Jugador("Bot");

    }

    public void mostrarNombre(){
        System.out.println(user.getNombre());
        for(Carta carta : user.getCartas()){
            System.out.println(carta.mostrarCarta());
        }
        System.out.println("\n"+"--------------------------------------------"+"\n");
        System.out.println(bot.getNombre());
        for(Carta carta : bot.getCartas()){
            System.out.println(carta.mostrarCarta());
        }



    }

    public void calcularPuntos(){
        int totalUser = 0;
        int totalBot = 0;
        for(Carta carta : user.getCartas()){
            totalUser += carta.getNumero();
        }
        for(Carta carta : bot.getCartas()){
            totalBot += carta.getNumero();
        }

        System.out.println("\n\nPuntaje Bot: " + totalBot + "\n-------------------\n" +
                "Puntaje ususario: " + totalUser);

        if(totalUser > 21 && totalBot <= 21){
            System.out.println("Gana Bot");
        }
        else if(totalBot > 21 && totalUser <= 21){

            System.out.println("Gana User");
        }
        else if (totalBot > totalUser){
            System.out.println("Gana Bot");
        }
        else{
            System.out.println("Gana User");

        }

    }

    public void repartir(){
        for (int i = 0; i < 3; i++) {
            user.agregarCarta(mazo.darCarta(i));
            bot.agregarCarta(mazo.darCarta(i+3));

        }

    }


    public Jugador getUser() {
        return user;
    }

    public void setUser(Jugador user) {
        this.user = user;
    }

    public Jugador getBot() {
        return bot;
    }

    public void setBot(Jugador bot) {
        this.bot = bot;
    }
}
