package backend.manejadores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

    public void cargarDatos(String direccionArchivo, ManejadorVentanas ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        String[] lineasArchivo;
        String encabezado;
        ArrayList<String> campos;
        lineasArchivo = listarLineasArchivo(direccionArchivo);
        for (int i = 0; i < lineasArchivo.length; i++) {
            encabezado = extraerEncabezado(lineasArchivo[i]);
            campos = extraerCampos(lineasArchivo[i]);
            definirAspectoJuego(encabezado, campos);
        }

    }

    public Tablero getTablero() {
        return this.tablero;
    }

    private void definirAspectoJuego(String encabezado, ArrayList<String> campos) {
        if (encabezado.equalsIgnoreCase("tablero")) {
            cargarTablero(campos);
        }

        if (seCreoTablero) {
            if (encabezado.equalsIgnoreCase("pierdeturno")) {
                cargarPierdeTurno(campos);
            } else if (encabezado.equalsIgnoreCase("tiradados")) {
                cargarTiradados(campos);
            } else if (encabezado.equalsIgnoreCase("avanza")) {
                cargarAvanza(campos);
            } else if (encabezado.equalsIgnoreCase("retrocede")) {
                cargarRetrocede(campos);
            } else if (encabezado.equalsIgnoreCase("subida")) {
                cargarSubida(campos);
            } else if (encabezado.equalsIgnoreCase("bajada")) {
                cargarBajada(campos);
            } else {
                // LA LINEA NO TIENE UNA INSTRUCCION VALIDA
            }
        } else {
            // SALTAR Y AVISAR QUE LA PRIMERA LINEA TIENE QUE SER CARGAR TABLERO
        }
    }

    private void cargarTablero(ArrayList<String> campos) {
        tablero.setFilas(Integer.valueOf(campos.get(0)));
        tablero.setColumnas(Integer.valueOf(campos.get(1)));
        seCreoTablero = tablero.crearTablero();
    }

    private void cargarPierdeTurno(ArrayList<String> campos) {
        Especial especial = new PierdeTurno(ventanaPrincipal);
        int fila = Integer.valueOf(campos.get(0));
        int columna = Integer.valueOf(campos.get(1));
        tablero.asignarEspecial(especial, fila, columna);
    }

    private void cargarTiradados(ArrayList<String> campos) {
        Especial especial = new Tiradados();
        int fila = Integer.valueOf(campos.get(0));
        int columna = Integer.valueOf(campos.get(1));
        tablero.asignarEspecial(especial, fila, columna);

    }

    private void cargarAvanza(ArrayList<String> campos) {
        int cantidadPosiciones = Integer.valueOf(campos.get(2));
        Especial especial = new Avanza(cantidadPosiciones, this.tablero);
        int fila = Integer.valueOf(campos.get(0));
        int columna = Integer.valueOf(campos.get(1));
        tablero.asignarEspecial(especial, fila, columna);

    }

    private void cargarRetrocede(ArrayList<String> campos) {
        int cantidadPosiciones = Integer.valueOf(campos.get(2));
        Especial especial = new Retrocede(cantidadPosiciones, this.tablero);
        int fila = Integer.valueOf(campos.get(0));
        int columna = Integer.valueOf(campos.get(1));
        tablero.asignarEspecial(especial, fila, columna);

    }

    private void cargarSubida(ArrayList<String> campos) {
        int posicionInicialX = Integer.valueOf(campos.get(0));
        int posicionInicialY = Integer.valueOf(campos.get(1));
        int posicionFinalX = Integer.valueOf(campos.get(2));
        int posicionFinalY = Integer.valueOf(campos.get(3));

        Especial especial = new Subida(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY, this.tablero);
        tablero.asignarEspecial(especial, posicionInicialX, posicionInicialY);

    }

    private void cargarBajada(ArrayList<String> campos) {
        int posicionInicialX = Integer.valueOf(campos.get(0));
        int posicionInicialY = Integer.valueOf(campos.get(1));
        int posicionFinalX = Integer.valueOf(campos.get(2));
        int posicionFinalY = Integer.valueOf(campos.get(3));

        Especial especial = new Bajada(posicionInicialX, posicionInicialY, posicionFinalX, posicionFinalY, this.tablero);
        tablero.asignarEspecial(especial, posicionInicialX, posicionInicialY);
    }

    public ArrayList<String> extraerCampos(String lineaArchivo) {
        ArrayList<String> lista;
        String[] cadena;
        String encabezado;
        cadena = lineaArchivo.split("\\(");
        String campos = lineaArchivo.substring(cadena[0].length() + 1, lineaArchivo.length() - 1);
        String[] camposIndividuales = campos.split(",");
        lista = convertirArregloAArrayList(camposIndividuales);
        return lista;
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
