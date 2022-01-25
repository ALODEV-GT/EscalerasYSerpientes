package backend.especiales;

import backend.clases.Jugador;
import backend.clases.Posicion;
import backend.clases.Tablero;

public abstract class Serpiente implements Especial{
    protected final int numCasillasMover;
    protected Tablero tablero;

    public Serpiente(int numCasillasMover, Tablero tablero){
        this.numCasillasMover = numCasillasMover;
        this.tablero = tablero;
    }

    protected void mover(int numCasillasAvanzar, Jugador jugador, Posicion[] posiciones) {
        int posicionActual = jugador.getPosicionActual();
        posiciones[posicionActual].getCasilla().quitarFicha(jugador);
        posiciones[posicionActual + numCasillasAvanzar].getCasilla().agregarFicha(jugador.getMiFicha());
        jugador.setPosicionActual(posicionActual + numCasillasAvanzar);
    }

}
