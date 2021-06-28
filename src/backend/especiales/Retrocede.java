package backend.especiales;

import java.awt.Color;

import backend.clases.Jugador;
import backend.clases.Tablero;

public class Retrocede extends Serpiente {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(255, 202, 58);

    public Retrocede(int numCasillasMover, Tablero tablero) {
        super(-numCasillasMover, tablero);
        DESCRIPCION = "<html><body>&nbsp;Regresa <br>&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;" + numCasillasMover + "<br> &nbsp;&nbsp;casillas</body></html>";
    }

    public void activar(Jugador jugador) {
        super.mover(super.numCasillasMover, jugador, super.tablero.getPosiciones());  
    }

    public String getDescripcion() {
        return DESCRIPCION;
    }

    public Color getColorCasilla() {
        return COLOR_CASILLA;
    }

}
