package backend.especiales;

import backend.clases.Jugador;
import backend.clases.Tablero;
import java.awt.Color;

public class Subida extends Escalera {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(106, 76, 147);

    private Tablero tablero;

    public Subida(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY, Tablero tablero){
        super(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY);
        this.tablero = tablero;
        DESCRIPCION = "<html><body>&nbsp;Sube a <br>la casilla<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + Escalera.obtenerNumeroCasilla(tablero, posicionFinalX, posicionFinalY)+"</body></html>"; 
    }

    public void activar(Jugador jugador) {
        // CAMBIAR DE POSICIONES
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
