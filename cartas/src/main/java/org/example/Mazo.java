package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
    private List<Carta> cartas;

   public Mazo(){
       this.cartas = new ArrayList<>();
       for (int i = 0; i < 4; i++) {
           String palo = "";
           if (i == 0){
               palo = "Copas";
           }
           else if (i == 1){
               palo = "Basto";
           } else if (i == 2){
               palo = "Oro";
           }
           else if (i == 3){
               palo = "Espada";
           }
           for (int j = 0; j < 12; j++) {
               Carta cart1 = new Carta(j + 1, palo);
               cartas.add(cart1);
           }

       }

   }

    public void mezclarMazo() {
        Random random = new Random();
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public void mostrarMazo(){
       for(Carta carta : cartas){
           System.out.println(carta.mostrarCarta());

       }
   }

   public Carta darCarta(int pos){

       return cartas.get(pos);
   }

}
