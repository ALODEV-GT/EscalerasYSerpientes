package backend.especiales;

import backend.clases.Casilla;
import backend.clases.Jugador;
import backend.clases.Posicion;
import backend.clases.Tablero;

public abstract class Escalera implements Especial {
    private final int posicionInicialX;
    private final int posicionInicialY;
    private final int posicionFinalX;
    private final int posicionFinalY;
    protected int posicionInicial;
    protected int posicionFinal;
    protected Tablero tablero;

    public Escalera(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY,
    Tablero tablero){
        this.tablero = tablero;
        this.posicionInicialX = posicionInicialX;
        this.posicionInicialY = posicionInicialY;
        this.posicionFinalX = posicionFinalX;
        this.posicionFinalY = posicionFinalY;

        this.posicionInicial = obtenerNumeroCasilla(this.tablero, posicionInicialX, posicionInicialY);
        this.posicionFinal = obtenerNumeroCasilla(this.tablero, posicionFinalX, posicionFinalY);
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

    protected void mover(int numCasillasAvanzar, Jugador jugador, Posicion[] posiciones) {
        int posicionActual = jugador.getPosicionActual();
        posiciones[posicionActual].getCasilla().quitarFicha(jugador);
        posiciones[posicionActual + numCasillasAvanzar].getCasilla().agregarFicha(jugador.getMiFicha());
        jugador.setPosicionActual(posicionActual + numCasillasAvanzar);
    }

}
