package backend.clases;

public class Tablero {
    private Casilla[][] tablero; 
    private int filas = 0;
    private int columnas = 0;

    public Tablero(){

    }

    public Tablero(int filas, int columnas){
              
        
    }

    public void setFilas(int filas){
        this.filas = filas;
    }

    public void setColumnas(int columnas){
        this.columnas = columnas;
    }

    public boolean crearTablero(){
        boolean creado = false;
        if (filas != 0 && columnas != 0 ) {
            tablero = new Casilla[filas][columnas];
            creado = true;
        }
        
        return creado;  
    }


}