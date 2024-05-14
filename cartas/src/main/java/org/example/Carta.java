package org.example;

public class Carta {
    private int numero;
    private String palo;

    public Carta(int numero, String palo){
        this.numero = numero;
        this.palo = palo;
    }

    public String mostrarCarta(){
        return this.numero + " de " + palo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
}
