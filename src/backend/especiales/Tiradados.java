package backend.especiales;

import java.awt.Color;

import backend.clases.Jugador; 

public class Tiradados implements Especial{
    private final String DESCRIPCION = "<html><body>Vuelve <br>a tirar <br>el dado</body></html>";
    private static final Color COLOR_CASILLA = new Color(25, 130, 196);

    public void activar(Jugador jugador){
        
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
