package backend.clases;

public class Jugador {

    private Ficha miFicha;
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas = 0;
    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;
    private int numTurno;
    private int posicionActual = 1;

    public Ficha getMiFicha() {
        return miFicha;
    }

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.miFicha = new Ficha(this);
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void agregarPartidaJugada() {
        this.partidasJugadas++;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void agregarPartidaGanada() {
        this.partidasGanadas++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void agregarPartidaPerdida() {
        this.partidasPerdidas++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
