package org.example;

import org.w3c.dom.ls.LSOutput;

public class entrada extends Persona {

    private String puesto;


    public entrada(String nombre, int edad, boolean estado, String puesto) {
        super(nombre, edad, estado);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
