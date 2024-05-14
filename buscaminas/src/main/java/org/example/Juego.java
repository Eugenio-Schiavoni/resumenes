package org.example;

public class Juego {

    private Tablero tablero;

    public Juego(){
        this.tablero = new Tablero();
        tablero.ponerMinas(3);
        tablero.dibujarTablero();
    }

    public void disparar(int fila, int columna){
        tablero.dibujardisparo(fila, columna);

    }

    public void mostrarTablero(){
        tablero.dibujarTablero();
    }


}
