package backend.especiales;
import java.awt.Color;

import backend.clases.Jugador;
import frontend.AvisosFrt;
import frontend.ManejadorVentanas;

public class PierdeTurno implements Especial{
    private final String DESCRIPCION = "<html><body><br>Pierdes<br>&nbsp;turno<body></html>";
    private final Color COLOR_CASILLA = new Color(255, 89, 94);

    private ManejadorVentanas ventanaPrincipal;
    public PierdeTurno(ManejadorVentanas ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void activar(Jugador jugador){
        AvisosFrt.mostrarMensaje(ventanaPrincipal, "Perdiste turno, no juegas en la siguiente ronda");
        jugador.setTurnoPerdido(true);
    }

    public String getDescripcion(){
        return this.DESCRIPCION;
    }

    public Color getColorCasilla(){
        return this.COLOR_CASILLA;
    }
}
