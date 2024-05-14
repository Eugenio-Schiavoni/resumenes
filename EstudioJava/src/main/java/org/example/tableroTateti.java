package org.example;

public class tableroTateti {

    String[][] tablero;

    public tableroTateti(){
        tablero = new String[3][3];
        cargarTablero();

    }

    public String[][] cargarTablero(){
        int contador = 1;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] =String.valueOf("| |");
                //contador++;
            }
        }
        return tablero;
    }

    public void imprimirTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

    public boolean colocarFichas(int pos_x, int pos_y, String c){
        if(estaLibre(pos_x, pos_y)){
            tablero[pos_x][pos_y] = c;
            imprimirTablero();
            System.out.println("\n------------------\n");
            return true;
        }
        else {
            System.out.println("Esta ocupado elija otro lugar");
            return false;

        }

    }

    public boolean estaLibre(int x, int y){
        if(tablero[x][y].equals("|O|") || tablero[x][y].equals("|X|")){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean verificarLibre(String var_verificar){
        boolean verificacion = false;

        try {
            int numero = Integer.parseInt(var_verificar);
            if (numero >= 1 && numero <= 9) {
                verificacion = true;
            } else {
                verificacion = false;
            }
        } catch (NumberFormatException e) {
            verificacion = false;
        }
        return verificacion;
    }



}
