package backend.especiales;

public abstract class Escalera implements Especial {
    private final int posicionInicialX;
    private final int posicionInicialY;
    private final int posicionFinalX;
    private final int posicionFinalY;

    public Escalera(int posicionInicialX, int posicionInicialY, int posicionFinalX, int posicionFinalY){
        this.posicionInicialX = posicionInicialX;
        this.posicionInicialY = posicionInicialY;
        this.posicionFinalX = posicionFinalX;
        this.posicionFinalY = posicionFinalY;
    }

}
