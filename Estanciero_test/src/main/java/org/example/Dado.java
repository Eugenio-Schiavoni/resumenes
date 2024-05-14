package org.example;

public class Dado {
    public int lanzar() {
        return (int) (Math.random() * 6) + 1;  // Genera un número entre 1 y 6
    }
}

