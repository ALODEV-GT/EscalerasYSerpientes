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
    private int posicionActual = 0;
    private boolean turnoPerdido = false;

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

    public void setTurnoPerdido(boolean turnoPerdido) {
        this.turnoPerdido = turnoPerdido;
    }

    public boolean isTurnoPerdido() {
        return turnoPerdido;
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

    public int getId() {
        return id;
    }

    public String[] getInformacion(){
        String[] info = new String[6];
        info[0] = String.valueOf(this.id);
        info[1] = this.nombre;
        info[2] = this.apellido;
        info[3] = String.valueOf(this.partidasGanadas);
        info[4] = String.valueOf(this.partidasPerdidas);
        info[5] = String.valueOf(this.partidasJugadas);
        return info;
    }

    public void reiniciarValores(){
        this.posicionActual = 0;
        Ficha miFicha = new Ficha(this);
        this.miFicha = miFicha;
    }
}