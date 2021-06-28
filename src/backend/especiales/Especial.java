package backend.especiales;

import java.awt.Color;

import backend.clases.Jugador;

public interface Especial {

    public void activar(Jugador jugador);

    public String getDescripcion();

    public Color getColorCasilla();

}
