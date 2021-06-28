package backend.especiales;

import java.awt.Color;

import backend.clases.Casilla;
import backend.clases.Jugador;
import backend.clases.Tablero;

public class Bajada extends Escalera {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(118, 200, 147);

    private Tablero tablero;

    public Bajada(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY, Tablero tablero){
        super(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY, tablero);
        DESCRIPCION = "<html><body>&nbsp;&nbsp;Baja a <br> la casilla <br> &nbsp; &nbsp; &nbsp;" + Escalera.obtenerNumeroCasilla(tablero, posicionFinalX, posicionFinalY)+"</body></html>"; 
    }

    public void activar(Jugador jugador) {
        super.mover(super.posicionFinal - super.posicionInicial, jugador, super.tablero.getPosiciones());
    }

    @Override
    public String getDescripcion() {
        return DESCRIPCION;
    }

    @Override
    public Color getColorCasilla() {
        return COLOR_CASILLA;
    }
    
}
