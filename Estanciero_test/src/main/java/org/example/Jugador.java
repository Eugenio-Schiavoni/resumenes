package org.example;


import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int dinero;
    private ArrayList<Propiedad> propiedades;
    private boolean esHumano;
    private int posicion;
    private boolean enCarcel;

    public Jugador(String nombre, int dineroInicial, boolean esHumano) {
        this.nombre = nombre;
        this.dinero = dineroInicial;
        this.propiedades = new ArrayList<>();
        this.esHumano = esHumano;
        this.posicion = 0;  // Todos empiezan en la casilla de salida
        this.enCarcel = false;
    }

    public void mover(int casillas) {
        if (!enCarcel) {
            posicion = (posicion + casillas) % 40;  // Asumiendo un tablero de 40 casillas
            System.out.println(nombre + " se mueve a la casilla " + posicion);
        } else {
            System.out.println(nombre + " está en la cárcel y no puede moverse.");
        }
    }

    public void pagar(int cantidad) {
        if (dinero > cantidad) {
            dinero -= cantidad;
            System.out.println(nombre + " paga " + cantidad + " y ahora tiene " + dinero);
        } else {
            System.out.println(nombre + " no tiene suficiente dinero para pagar " + cantidad);
            // Aquí se puede añadir lógica para manejar la bancarrota o la venta de propiedades
        }
    }

    public void recibir(int cantidad) {
        dinero += cantidad;
        System.out.println(nombre + " recibe " + cantidad + " y ahora tiene " + dinero);
    }

    public void comprarPropiedad(Propiedad propiedad) {
        if (dinero > propiedad.getPrecioCompra() && !propiedades.contains(propiedad)) {
            propiedades.add(propiedad);
            pagar(propiedad.getPrecioCompra());
            System.out.println(nombre + " compra " + propiedad.getNombre());
        } else {
            System.out.println(nombre + " no puede comprar " + propiedad.getNombre());
        }
    }

    // Métodos get y set necesarios para la lógica del juego
    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public boolean isEsHumano() {
        return esHumano;
    }

    public void setEnCarcel(boolean enCarcel) {
        this.enCarcel = enCarcel;
    }

    public int getPosicion() {
        return posicion;
    }
}
