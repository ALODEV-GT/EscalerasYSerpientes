package backend.especiales;

import java.awt.Color;

import backend.clases.Jugador;

public class Retrocede extends Serpiente {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(255, 202, 58);

    public Retrocede(int numCasillasMover) {
        super(numCasillasMover);
        DESCRIPCION = "<html><body>&nbsp;Regresa <br>&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;" + numCasillasMover + "<br> &nbsp;&nbsp;casillas</body></html>";
    }

    public void activar(Jugador jugador) {
        // Mover ficha
    }

    public String getDescripcion() {
        return DESCRIPCION;
    }

    public Color getColorCasilla() {
        return COLOR_CASILLA;
    }

}
