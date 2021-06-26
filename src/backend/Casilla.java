package backend;

import java.util.ArrayList;

public class Casilla {
    private ArrayList<Ficha> fichas = new ArrayList<>();

    public Casilla() {

    }

    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public void quitarFicha() {

    }
}
