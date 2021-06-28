package backend.especiales;

import backend.clases.Jugador;
import backend.clases.Tablero;
import java.awt.Color;

public class Subida extends Escalera {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(106, 76, 147);

    public Subida(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY, Tablero tablero){
        super(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY, tablero);
        DESCRIPCION = "<html><body>&nbsp;Sube a <br>la casilla<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + Escalera.obtenerNumeroCasilla(tablero, posicionFinalX, posicionFinalY)+"</body></html>"; 
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
