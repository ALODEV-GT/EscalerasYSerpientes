package backend.clases;

public class Ficha {

    public static int numColoresUsados = 0;
    private Jugador jugador;
    private ColorFicha color;

    public Ficha(Jugador jugador) {
        this.jugador = jugador;
        asignarColor();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void asignarColor() {
        switch (numColoresUsados) {
            case 0:
                color = ColorFicha.AMARILLO;
                break;
            case 1:
                color = ColorFicha.AZUL;
                break;
            case 2:
                color = ColorFicha.NEGRO;

                break;
            case 3:
                color = ColorFicha.ROJO;

                break;
            case 4:
                color = ColorFicha.VERDE;

                break;
            case 5:
                color = ColorFicha.MORADO;

                break;
            default:
                break;
        }
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
