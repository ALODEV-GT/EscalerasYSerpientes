package backend;

public class Ficha {
    private Jugador jugador;
    private ColorFicha color;

    public Ficha(Jugador jugador, ColorFicha color) {
        this.jugador = jugador;
        this.color = color;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}