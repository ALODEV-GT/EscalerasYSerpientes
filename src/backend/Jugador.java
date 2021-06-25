package backend;

public class Jugador {

    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas = 0;
    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void agregarPartidaJugada() {
        this.partidasJugadas++;
    }

    public void agregarPartidaGanada() {
        this.partidasGanadas++;
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
