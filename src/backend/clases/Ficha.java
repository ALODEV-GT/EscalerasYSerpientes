package backend.clases;

import java.io.Serializable;

import javax.swing.ImageIcon;

public class Ficha implements Serializable {

    public static int numColoresUsados = 0;
    private Jugador jugador;
    private ColorFicha color;
    private ImageIcon ficha;
    private ImageIcon fichaGrande;

    public Ficha(Jugador jugador) {
        this.jugador = jugador;
        asignarColor();
        numColoresUsados++;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void asignarColor() {
        switch (numColoresUsados) {
            case 0:
                color = ColorFicha.ROSA;
                ficha = new ImageIcon("src/resources/ROSA.png");
                fichaGrande = new ImageIcon("src/resources/ROSAG.png");
                break;
            case 1:
                color = ColorFicha.AZUL;
                ficha = new ImageIcon("src/resources/AZUL.png");
                fichaGrande = new ImageIcon("src/resources/AZULG.png");
                break;
            case 2:
                color = ColorFicha.NARANJA;
                ficha = new ImageIcon("src/resources/NARANJA.png");
                fichaGrande = new ImageIcon("src/resources/NARANJAG.png");

                break;
            case 3:
                color = ColorFicha.ROJO;
                ficha = new ImageIcon("src/resources/ROJA.png");
                fichaGrande = new ImageIcon("src/resources/ROJAG.png");

                break;
            case 4:
                color = ColorFicha.VERDE;
                ficha = new ImageIcon("src/resources/VERDE.png");
                fichaGrande = new ImageIcon("src/resources/VERDEG.png");

                break;
            case 5:
                color = ColorFicha.MORADO;
                ficha = new ImageIcon("src/resources/MORADO.png");
                fichaGrande = new ImageIcon("src/resources/MORADOG.png");
                break;
            default:
                break;
        }
    }       

    public ImageIcon getImagenFicha() {
        return ficha;
    }

    public ImageIcon getFichaGrande() {
        return fichaGrande;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
