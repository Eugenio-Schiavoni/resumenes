package org.example;
import java.util.Random;

public class Dados {

    private int valor;

    public Dados(){
        this.valor = 0;
    }

    public int tirarDado() {
        Random rand = new Random();
        // Generamos un número aleatorio entre 1 y 6
        this.valor = rand.nextInt(6) + 1;
        return this.valor;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void TirarDados() {
        Random rand = new Random();
        this.valor = rand.nextInt(6) + 1;
    }
}
