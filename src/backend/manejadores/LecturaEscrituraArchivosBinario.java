package backend.manejadores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaEscrituraArchivosBinario<T>{

    private final String direccionArchivoBin;
    private T object;

    public LecturaEscrituraArchivosBinario(String direccionArchivoBin) {
        this.direccionArchivoBin = direccionArchivoBin;
    }

    /**
     * Lee un archivo binario de la ruta espicificada en el constructor, y lo
     * retorna segun su tipo especificado en la instanciacion de esta clase.
     *
     * @return un objeto del tipo especificado en la instanciacion de esta
     * clase.
     */
    public T leerArchivoBin(){
        try {
            FileInputStream fis = new FileInputStream(direccionArchivoBin);
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.object = (T) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }

        return this.object;
    }

    /**
     * Escribe una objeto del tipo especificado en la instanciacion de esta
     * clase, lo escribe en la ruta especificada en el constructor.
     *
     * @param objetoAEscribir es el objeto que sea deas escribir.
     */
    public void escribirArchivoBin(T objetoAEscribir) {
        try {
            FileOutputStream fos = new FileOutputStream(direccionArchivoBin);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objetoAEscribir);
            oos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraArchivosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
