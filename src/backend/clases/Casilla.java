package backend.clases;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import backend.especiales.Especial;

public class Casilla {
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private Tablero tableroPadre;
    private Especial especial;
    private int numCasilla;
    private boolean esEspecial = false;

    // Frontend
    private JPanel panel;
    private JLabel label;

    public Casilla(Tablero tablero, int numCasilla) {
        tableroPadre = tablero;
        this.numCasilla = numCasilla;

        panel = new JPanel();
        panel.setSize(55, 70);
        panel.setBackground(new Color(254, 195, 166));
        Border borde = new TitledBorder(new LineBorder(new Color(255, 146, 139)), "");
        panel.setBorder(borde);

        label = new JLabel("" + numCasilla);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setSize(55, 70);
        panel.add(label);
    }

    public void setEspecial(Especial especial) {
        this.especial = especial;
        this.panel.setBackground(especial.getColorCasilla());
        this.label.setText(especial.getDescripcion());
        this.esEspecial = true;
    }

    public boolean esEspecial() {
        return esEspecial;
    }

    public void activarEspecial(Jugador jugador){
        this.especial.activar(jugador);
    }

    public int getNumCasilla() {
        return numCasilla;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public void quitarFicha(Jugador jugador) {
        for (int i = 0; i < fichas.size(); i++) {
            if (fichas.get(i).getJugador().equals(jugador)) {
                fichas.remove(i);
                break;
            }
        }
    }
}
