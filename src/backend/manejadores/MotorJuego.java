package backend.manejadores;

import javax.swing.JFrame;
import javax.swing.JLabel;

import backend.clases.Jugador;
import backend.clases.Posicion;
import backend.clases.Tablero;
import backend.especiales.PierdeTurno;
import backend.especiales.Tiradados;
import frontend.AvisosFrt;
import frontend.ManejadorVentanas;

public class MotorJuego {

    private Tablero tablero;
    private Jugador[] jugadores;
    private boolean terminado = false;
    private JLabel mostrarTurnoDe;
    private boolean yaEligio = false;
    private JLabel mostrarNumDado;
    private ManejadorVentanas parent;

    public MotorJuego(Jugador[] jugadores, JLabel mostrarNumDado, JLabel mostrarTurnoDe, Tablero tablero,
            ManejadorVentanas parent) {
        this.parent = parent;
        this.mostrarNumDado = mostrarNumDado;
        this.tablero = tablero;
        this.mostrarTurnoDe = mostrarTurnoDe;
        this.jugadores = jugadores;
        this.yaEligio = yaEligio;
        asignarTurno();
        ordenarJugadores(true);

        ManejarTurnos manejo = new ManejarTurnos();
        manejo.start();
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void setYaEligio(boolean yaEligio) {
        this.yaEligio = yaEligio;
    }

    private class ManejarTurnos extends Thread {
        private Posicion[] posiciones = tablero.getPosiciones();

        public void run() {

            mostrarNumDado.setText("");
            int numTurno = 0;
            do {
                if (numTurno == jugadores.length) {
                    numTurno = 0;
                }

                if (jugadores[numTurno].isTurnoPerdido()) {
                    jugadores[numTurno].setTurnoPerdido(false);
                } else {

                    mostrarTurnoDe.setText(
                            "Es turno de " + jugadores[numTurno].getNombre() + " " + jugadores[numTurno].getApellido());
                    while (!yaEligio) {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            System.err.println("Ocurrio un error al esperar");
                        }
                        System.out.println("Esperando a que pare el dado");
                    }
                    yaEligio = false;

                    int numCasillasAvanzar = generarNumAleatorio(1, 6);
                    mostrarNumDado.setText("" + numCasillasAvanzar);

                    mover(numCasillasAvanzar, jugadores[numTurno]);
                    if (posiciones[jugadores[numTurno].getPosicionActual()].getCasilla().esEspecial()) {

                        if (posiciones[jugadores[numTurno].getPosicionActual()].getCasilla()
                                .getEspecial() instanceof Tiradados) {
                            numTurno--;
                            AvisosFrt.mostrarMensaje(parent, "Vuelve a tirar el dado");
                        } else {
                            for (int i = 0; i < 1; i++) {
                                try {
                                    sleep(500);
                                } catch (InterruptedException e) {
                                    System.err.println("Ocurrio un error al esperar");
                                }
                            }
                            posiciones[jugadores[numTurno].getPosicionActual()].getCasilla()
                                    .activarEspecial(jugadores[numTurno]);
                        }

                    }
                }
                numTurno++;

            } while (!terminado);
        }

        private void mover(int numCasillasAvanzar, Jugador jugador) {
            int posicionActual = jugador.getPosicionActual();
            posiciones[posicionActual].getCasilla().quitarFicha(jugador);
            posiciones[posicionActual + numCasillasAvanzar].getCasilla().agregarFicha(jugador.getMiFicha());
            jugador.setPosicionActual(posicionActual + numCasillasAvanzar);
        }

    }

    // INICIO ASIGNAR TURNOS ALEATORIMANTE

    private void asignarTurno() {
        int[] turnosAsignados = new int[jugadores.length];
        boolean existe;
        for (int i = 0; i < jugadores.length; i++) {
            int numTurno;
            do {
                numTurno = generarNumAleatorio(1, jugadores.length);
                existe = buscarExistenciaTurno(numTurno, turnosAsignados);
            } while (existe);
            jugadores[i].setNumTurno(numTurno);
        }
    }

    // Metodo insercion
    public void ordenarJugadores(boolean ascendente) {
        boolean cambio = true;
        for (int i = 1; i < jugadores.length; i++) {
            for (int j = i; j > 0; j--) {

                if (ascendente) {
                    cambio = jugadores[i].getNumTurno() < jugadores[i].getNumTurno();
                } else {
                    cambio = jugadores[i].getNumTurno() > jugadores[i].getNumTurno();
                }

                if (cambio) {
                    Jugador aux = jugadores[j];
                    jugadores[j] = jugadores[j - 1];
                    jugadores[j - 1] = aux;
                } else {
                    break;
                }
            }
        }
    }

    private boolean buscarExistenciaTurno(int numTurno, int[] turnosAsignados) {
        boolean existe = false;
        for (int i = 0; i < turnosAsignados.length; i++) {
            if (turnosAsignados[i] != 0) {
                if (turnosAsignados[i] == numTurno) {
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }

    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    // FIN ASIGNAR TURNOS ALEATORIAMENTE

}
