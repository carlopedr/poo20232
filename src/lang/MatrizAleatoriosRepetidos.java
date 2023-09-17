
package lang;

public class MatrizAleatoriosRepetidos {
     public static void main(String[] args) {
        int filas = 4; // Cambia este valor para ajustar el tamaño de la matriz
        int columnas = 4; // Cambia este valor para ajustar el tamaño de la matriz
        int[][] matriz = new int[filas][columnas];

        // Llena la matriz con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*100); // Números aleatorios entre 0 y 99
            }
        }
        //Para verificar si tiene repetidos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valorActual = matriz[i][j];
                // Compara el valor actual con todos los valores en la matriz, excluyendo la ubicación actual
                for (int x = 0; x < filas; x++) {
                    for (int y = 0; y < columnas; y++) {
                        if (x != i || y != j) {
                            if (matriz[x][y] == valorActual) {
                                System.out.println("El valor "+ valorActual+" esta repetido");    
                            }
                        }
                    }
                }
            }
        }
    }
}
