package backend.clases;

import java.util.ArrayList;

import backend.especiales.Especial;

public class Casilla {
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private Tablero tableroPadre;
    private Especial especial;

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
}
