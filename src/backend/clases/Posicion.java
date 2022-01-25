package backend.clases;

public class Posicion {
    private final Casilla casilla;
    private final int numCasilla;
    private final int iMatriz;
    private final int jMatriz;

    public Posicion(Casilla casilla, int numCasilla, int iMatriz, int jMatriz){
        this.casilla = casilla;
        this.numCasilla = numCasilla;
        this.iMatriz = iMatriz;
        this.jMatriz = jMatriz;
    }

    public Casilla getCasilla() {
        return casilla;
    }
}
