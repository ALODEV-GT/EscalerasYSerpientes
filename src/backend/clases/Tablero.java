package backend.clases;

import backend.especiales.Especial;

public class Tablero {
    private Casilla[][] tablero;
    private int filas = 0;
    private int columnas = 0;

    public Tablero() {

    }

    public Tablero(int filas, int columnas) {

    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public boolean crearTablero() {
        boolean creado = false;
        if (filas != 0 && columnas != 0) {
            tablero = new Casilla[filas][columnas];
            crearCasillas();
            creado = true;
        }

        return creado;
    }

    private void crearCasillas() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Casilla(this);
            }
        }
    }

    public void asignarEspecial(Especial especial, int posicionX, int posicionY){
        tablero[posicionX][posicionY].setEspecial(especial); 
    }
}