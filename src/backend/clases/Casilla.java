package backend.clases;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import backend.especiales.Especial;

public class Casilla {
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private Tablero tableroPadre;
    private Especial especial;
    
    //Frontend
    private JPanel panel;
    private JLabel label;
    private int numCasilla;

    public Casilla(Tablero tablero) {
        tableroPadre = tablero;
    }

    public void setEspecial(Especial especial){
        this.especial = especial;
    }

    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public void quitarFicha() {

    }

    public void asignarGrafico(JPanel panel, JLabel label){
        this.panel = panel;
        this.label = label;
        numCasilla = Integer.valueOf(label.getText());
    }
    
}
