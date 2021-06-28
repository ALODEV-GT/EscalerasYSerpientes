package backend.especiales;

import backend.clases.Casilla;
import backend.clases.Tablero;

public abstract class Escalera implements Especial {
    private final int posicionInicialX;
    private final int posicionInicialY;
    private final int posicionFinalX;
    private final int posicionFinalY;

    public Escalera(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY){
        this.posicionInicialX = posicionInicialX;
        this.posicionInicialY = posicionInicialY;
        this.posicionFinalX = posicionFinalX;
        this.posicionFinalY = posicionFinalY;
    }

    public static int obtenerNumeroCasilla(Tablero tablero, int posicionFinalX, int posicionFinalY) {
        int numCasilla = 0;
        Casilla[][] tab = tablero.getTablero();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == posicionFinalX && j == posicionFinalY) {
                    numCasilla = tab[i][j].getNumCasilla();
                }
            }
        }

        return numCasilla;
    }

}
