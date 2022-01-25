package backend.manejadores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextArea;

import backend.clases.Tablero;
import backend.especiales.Avanza;
import backend.especiales.Bajada;
import backend.especiales.Especial;
import backend.especiales.PierdeTurno;
import backend.especiales.Retrocede;
import backend.especiales.Subida;
import backend.especiales.Tiradados;
import frontend.ManejadorVentanas;

public class CargarDatos {

    private Tablero tablero = new Tablero();
    private boolean seCreoTablero = false;
    private ManejadorVentanas ventanaPrincipal;
    private JTextArea espacioErrores;
    private boolean terminar = false;

    public void cargarDatos(String direccionArchivo, ManejadorVentanas ventanaPrincipal, JTextArea errores) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.espacioErrores = errores;
        String[] lineasArchivo;
        String encabezado;
        ArrayList<String> campos;
        lineasArchivo = listarLineasArchivo(direccionArchivo);
        for (int i = 0; i < lineasArchivo.length; i++) {
            encabezado = extraerEncabezado(lineasArchivo[i]);
            try {
                campos = extraerCampos(lineasArchivo[i]);
                definirAspectoJuego(encabezado, campos, (i + 1));
            } catch (MisExcepciones e) {
                errores.append("\nLinea " + (i + 1) + " :" + e.getMessage());
            }
            if (terminar) {
                break;
            }
        }
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    private void definirAspectoJuego(String encabezado, ArrayList<String> campos, int indice) throws MisExcepciones {
        if (encabezado.equalsIgnoreCase("tablero")) {
            cargarTablero(campos, indice);

        } else {

            if (seCreoTablero) {
                if (encabezado.equalsIgnoreCase("pierdeturno")) {
                    cargarPierdeTurno(campos, indice);
                } else if (encabezado.equalsIgnoreCase("tiradados")) {
                    cargarTiradados(campos, indice);
                } else if (encabezado.equalsIgnoreCase("avanza")) {
                    cargarAvanza(campos, indice);
                } else if (encabezado.equalsIgnoreCase("retrocede")) {
                    cargarRetrocede(campos, indice);
                } else if (encabezado.equalsIgnoreCase("subida")) {
                    cargarSubida(campos, indice);
                } else if (encabezado.equalsIgnoreCase("bajada")) {
                    cargarBajada(campos, indice);
                } else {
                    throw new MisExcepciones("Esta instruccion no existe");
                }
            } else {
                this.terminar = true;
                throw new MisExcepciones("La primera instruccion debe ser el tablero");
            }
        }
    }

    private void cargarTablero(ArrayList<String> campos, int indice) throws MisExcepciones {

        if (campos.size() != 2) {
            throw new MisExcepciones("Debes indicar el numero de filas y columnas tablero(filas,columnas)");
        }

        try {
            tablero.setFilas(Integer.valueOf(campos.get(0)));
            tablero.setColumnas(Integer.valueOf(campos.get(1)));
            seCreoTablero = tablero.crearTablero();
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: tablero(5,6)");
        }
    }

    private void cargarPierdeTurno(ArrayList<String> campos, int indice) throws MisExcepciones {

        if (campos.size() != 2) {
            throw new MisExcepciones("Numero de campos incorrecto. Correcto: pierdeturno(numFila,numColumna)");
        }

        try {
            Especial especial = new PierdeTurno(ventanaPrincipal);
            int fila = Integer.valueOf(campos.get(0));
            int columna = Integer.valueOf(campos.get(1));

            if (fila < 0 || fila > tablero.getFilas()-1 
            || columna < 0 || columna > tablero.getColumnas() -1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }

            tablero.asignarEspecial(especial, fila, columna);

        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: pierdeturno(2,1)");
        }
    }

    private void cargarTiradados(ArrayList<String> campos, int indice) throws MisExcepciones {
        if (campos.size() != 2) {
            throw new MisExcepciones("Numero de campos incorrecto. Correcto: tiradados(numFila,numColumna)");
        }

        try {
            Especial especial = new Tiradados();
            int fila = Integer.valueOf(campos.get(0));
            int columna = Integer.valueOf(campos.get(1));
            if (fila < 0 || fila > tablero.getFilas()-1 
            || columna < 0 || columna > tablero.getColumnas() -1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }
            tablero.asignarEspecial(especial, fila, columna);
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: tiradados(1,3)");
        }
    }

    private void cargarAvanza(ArrayList<String> campos, int indice) throws MisExcepciones {
        if (campos.size() != 3) {
            throw new MisExcepciones(
                    "Numero de campos incorrecto. Correcto: avanza(numFila,numColumna,casillasAAvanzar)");
        }

        try {
            int cantidadPosiciones = Integer.valueOf(campos.get(2));
            Especial especial = new Avanza(cantidadPosiciones, this.tablero);
            int fila = Integer.valueOf(campos.get(0));
            int columna = Integer.valueOf(campos.get(1));

            if (fila < 0 || fila > tablero.getFilas()-1 
            || columna < 0 || columna > tablero.getColumnas() -1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }

            if (cantidadPosiciones < 1) {
                throw new MisExcepciones("El parametro de posiciones a avanzar no es valido");
            }

            if (tablero.getTablero()[fila][columna].getNumCasilla() + cantidadPosiciones
            > tablero.getTablero()[tablero.getFilas()-1][tablero.getColumnas()-1].getNumCasilla()) {
                throw new MisExcepciones("El parametro de posiciones a avanzar se pasa del tablero");
            }

            tablero.asignarEspecial(especial, fila, columna);
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: avanza(0,4,5)");
        }

    }

    private void cargarRetrocede(ArrayList<String> campos, int indice) throws MisExcepciones {
        if (campos.size() != 3) {
            throw new MisExcepciones(
                    "Numero de campos incorrecto. Correcto: retrocede(numFila,numColumna,CasillasARetroceder)");
        }

        try {
            int cantidadPosiciones = Integer.valueOf(campos.get(2));
            Especial especial = new Retrocede(cantidadPosiciones, this.tablero);
            int fila = Integer.valueOf(campos.get(0));
            int columna = Integer.valueOf(campos.get(1));

            if (fila < 0 || fila > tablero.getFilas()-1 
            || columna < 0 || columna > tablero.getColumnas() -1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }

            if (cantidadPosiciones < 1) {
                throw new MisExcepciones("El parametro de posiciones a regresar no es valido");
            }

            if (tablero.getTablero()[fila][columna].getNumCasilla() - cantidadPosiciones
            < tablero.getTablero()[0][0].getNumCasilla()) {
                throw new MisExcepciones("El parametro de posiciones a regresar se pasa del tablero");
            }

            tablero.asignarEspecial(especial, fila, columna);
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: retrocede(1,3,5)");
        }
    }

    private void cargarSubida(ArrayList<String> campos, int indice) throws MisExcepciones {
        if (campos.size() != 4) {
            throw new MisExcepciones(
                    "Numero de campos incorrecto. Correcto: subida(numFilaInicial,numColInicial,numFilaFin,numColFin)");
        }

        try {
            int posicionInicialX = Integer.valueOf(campos.get(0));
            int posicionInicialY = Integer.valueOf(campos.get(1));
            int posicionFinalX = Integer.valueOf(campos.get(2));
            int posicionFinalY = Integer.valueOf(campos.get(3));

            if (posicionInicialX < 0 || posicionInicialX > tablero.getFilas()-1 
            || posicionFinalX < 0 || posicionFinalX > tablero.getFilas() -1 
            || posicionFinalY < 0 || posicionFinalY > tablero.getColumnas()-1 
            || posicionInicialY < 0 || posicionInicialY > tablero.getColumnas()-1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }

            Especial especial = new Subida(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY,
                    this.tablero);
            tablero.asignarEspecial(especial, posicionInicialX, posicionInicialY);
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: subida(2,3,1,3)");
        }

    }

    private void cargarBajada(ArrayList<String> campos, int indice) throws MisExcepciones {
        if (campos.size() != 4) {
            throw new MisExcepciones(
                    "Numero de campos incorrecto. Correcto: bajada(numFilaInicial,numColInicial,numFilaFin,numColFin)");
        }

        try {
            int posicionInicialX = Integer.valueOf(campos.get(0));
            int posicionInicialY = Integer.valueOf(campos.get(1));
            int posicionFinalX = Integer.valueOf(campos.get(2));
            int posicionFinalY = Integer.valueOf(campos.get(3));

            if (posicionInicialX < 0 || posicionInicialX > tablero.getFilas()-1 
            || posicionFinalX < 0 || posicionFinalX > tablero.getFilas() -1 
            || posicionFinalY < 0 || posicionFinalY > tablero.getColumnas()-1 
            || posicionInicialY < 0 || posicionInicialY > tablero.getColumnas()-1) {
                throw new MisExcepciones("La posicion que ingresaste no existe");
            }

            Especial especial = new Bajada(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY,
                    this.tablero);
            tablero.asignarEspecial(especial, posicionInicialX, posicionInicialY);

        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes ingresar numeros enteros Ej: bajada(1,3,2,3)");
        }
    }

    public ArrayList<String> extraerCampos(String lineaArchivo) throws MisExcepciones {
        try {
            ArrayList<String> lista;
            String[] cadena;
            String encabezado;
            cadena = lineaArchivo.split("\\(");
            String campos = lineaArchivo.substring(cadena[0].length() + 1, lineaArchivo.length() - 1);
            String[] camposIndividuales = campos.split(",");
            lista = convertirArregloAArrayList(camposIndividuales);
            return lista;

        } catch (StringIndexOutOfBoundsException e) {
            throw new MisExcepciones("Ingresa los campos  separalos con una coma");
        }
    }

    private ArrayList<String> convertirArregloAArrayList(String[] arreglo) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) {
            lista.add(arreglo[i]);
        }

        return lista;
    }

    private String extraerEncabezado(String lineaArchivo) {
        String[] cadena;
        String encabezado;
        cadena = lineaArchivo.split("\\(");
        encabezado = cadena[0];
        return encabezado;
    }

    public String[] listarLineasArchivo(String direccionArchivo) {
        ArrayList<String> listaLineasArchivo = new ArrayList();

        try {
            FileReader archivo = new FileReader(direccionArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea = lector.readLine();
            while (linea != null) {
                listaLineasArchivo.add(linea);
                linea = lector.readLine();
            }
            lector.close();
        } catch (FileNotFoundException ex) {
            //
        } catch (IOException ex) {
            //
        }

        return convertirArrayListAArreglo(listaLineasArchivo);
    }

    public String[] convertirArrayListAArreglo(ArrayList<String> lista) {
        String[] listaArreglo = new String[lista.size()];
        for (int i = 0; i < listaArreglo.length; i++) {
            listaArreglo[i] = lista.get(i);
        }
        return listaArreglo;
    }
}
