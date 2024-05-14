package org.example;

public class Persona {

    private String nombre;
    private int edad;
    private boolean estado;


    public Persona(String nombre, int edad, boolean estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse(){
        System.out.println("Hola, mi nombre es: " + this.nombre + " y mi edad es " + this.edad);
    }


}
