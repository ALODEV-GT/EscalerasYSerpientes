package backend.clases;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import backend.especiales.Especial;

public class Casilla {
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private Tablero tableroPadre;
    private Especial especial;

    // Frontend
    private JPanel panel;
    private JLabel label;

    public Casilla(Tablero tablero, int numCasilla) {
        tableroPadre = tablero;

                panel = new JPanel();
                panel.setSize(55, 70);
                panel.setBackground(new Color(255, 202, 58));
                Border borde = new TitledBorder(new LineBorder(new Color(255, 190, 20)), "");
                panel.setBorder(borde);

                label = new JLabel("" + numCasilla);
                label.setSize(55, 70);
                panel.add(label);
    }

    public void setEspecial(Especial especial) {
        this.especial = especial;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public void quitarFicha() {

    }
}
