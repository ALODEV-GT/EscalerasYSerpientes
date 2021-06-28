package backend.especiales;
import java.awt.Color;

import backend.clases.Jugador;

public class PierdeTurno implements Especial{
    private final String DESCRIPCION = "<html><body><br>Pierdes<br>&nbsp;turno<body></html>";
    private final Color COLOR_CASILLA = new Color(255, 89, 94);

    public void activar(Jugador jugador){

    }

    public String getDescripcion(){
        return this.DESCRIPCION;
    }

    public Color getColorCasilla(){
        return this.COLOR_CASILLA;
    }
}
