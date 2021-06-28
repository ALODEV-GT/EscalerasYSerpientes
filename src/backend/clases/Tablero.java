package backend.clases;

import backend.especiales.Especial;

public class Tablero {
    
    private Casilla[][] tablero;
    private int filas = 0;
    private int columnas = 0;
    private Posicion[] posiciones;

    public Tablero() {
        Ficha.numColoresUsados = 0;
    }

    public Tablero(int filas, int columnas) {
        Ficha.numColoresUsados = 0;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public boolean crearTablero() {
        boolean creado = false;
        if (filas != 0 && columnas != 0) {
            posiciones = new Posicion[filas*columnas];
            tablero = new Casilla[filas][columnas];
            crearCasillas();

            creado = true;
        }

        return creado;
    }

    private void crearCasillas() {
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Casilla(this, 1 + contador);
                posiciones[contador] = new Posicion(tablero[i][j], 1 + contador, i, j);
                contador++;
            }
        }
    }

    public Posicion[] getPosiciones() {
        return posiciones;
    }

    public void asignarEspecial(Especial especial, int posicionX, int posicionY) {
        tablero[posicionX][posicionY].setEspecial(especial);
    }


}