package backend.especiales;

public abstract class Serpiente implements Especial{
    private final int numCasillasMover;

    public Serpiente(int numCasillasMover){
        this.numCasillasMover = numCasillasMover;
    }

}
