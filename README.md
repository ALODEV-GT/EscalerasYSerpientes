# Escaleras y serpientes

## Descripcion
Juego de escaleras y serpientes, se puede jugar de 1-6 jugadores, el tablero es creado de acuerdo a las instrucciones de un archivo de entrada (Puedes crear tus propios archivo para tener tableros personalizados).

- Programacion orientada a objetos
- Hilos
- Archivos binarios
- Java Swing

## Funcionamiento 
Video: https://drive.google.com/file/d/1RneLU-TLeCtcjG9SawOcMgqrXjHYcGAC/view?usp=sharing

Capturas: https://drive.google.com/file/d/1qRyiCaLmoiwMTpKXcH8LtTdFlP-ffFTF/view?usp=sharing

## Instrucciones validas para crear archivos de entrada
tablero(filas,columnas)

pierdeturno(fila, columna)

tiradados(fila,columna)

avanza(fila, columna, cantPosiciones)

retrocede(fila, columna, cantPosiciones)

subida(filaInicial, columnaInicial, filaFinal, columnaFinal)

bajada(filaInicial, columnaInicial, filaFinal, columnaFinal)

### Descripcion:

tablero: debe ser la primera instrucción y define el tamaño del tablero.

pierdeturno: indica la fila y columna de la casilla que tiene la penalización de perder un turno.

tiradados: indica la fila y columna de la casilla que tiene la ventaja de que el jugador puede tirar los dados una vez más y avanzar.

avanza: indica la fila y columna de la casilla que tiene la ventaja de avanzar la cantidad de posiciones definidas.

retrocede: indica la fila y columna de la casilla que tiene la penalización de retroceder la cantidad de posiciones definidas.

### Ejemplo:
tablero(6,8)

retrocede(0,1,4)

tiradados(0,3)

subida(0,4,2,6)

retrocede(0,6,6)

avanza(0,7,1)
