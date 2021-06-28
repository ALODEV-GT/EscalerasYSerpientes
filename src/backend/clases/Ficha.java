package backend.clases;

import javax.swing.ImageIcon;

public class Ficha {

    public static int numColoresUsados = 0;
    private Jugador jugador;
    private ColorFicha color;
    private ImageIcon ficha;

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
                break;
            case 1:
                color = ColorFicha.AZUL;
                ficha = new ImageIcon("src/resources/AZUL.png");
                break;
            case 2:
                color = ColorFicha.NARANJA;
                ficha = new ImageIcon("src/resources/NARANJA.png");

                break;
            case 3:
                color = ColorFicha.ROJO;
                ficha = new ImageIcon("src/resources/ROJA.png");

                break;
            case 4:
                color = ColorFicha.VERDE;
                ficha = new ImageIcon("src/resources/VERDE.png");

                break;
            case 5:
                color = ColorFicha.MORADO;
                ficha = new ImageIcon("src/resources/MORADO.png");
                break;
            default:
                break;
        }
    }   

    public ImageIcon getImagenFicha() {
        return ficha;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
