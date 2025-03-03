package com.misiones;

public class NavegadorEstelar {

    /**
     * Multiplica dos matrices.
     *
     * @param matrizA Primera matriz.
     * @param matrizB Segunda matriz.
     * @return La matriz resultante de la multiplicación.
     * @throws IllegalArgumentException si las dimensiones son incompatibles.
     */
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            throw new IllegalArgumentException("Las matrices no son multiplicables: las columnas de A deben ser iguales a las filas de B.");
        }

        int[][] resultado = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    /**
     * Planifica una ruta a partir de una matriz que representa el terreno.
     * En este ejemplo, se multiplica la matriz del terreno por una matriz de "factor de ruta"
     * que tiene valores constantes (2 en cada celda) para simular la optimización de rutas.
     *
     * @param terreno Matriz que representa el terreno.
     * @return Matriz que representa la ruta planificada.
     */
    public static int[][] planificarRuta(int[][] terreno) {
        int filas = terreno.length;
        int columnas = terreno[0].length;

        // Crear una matriz de "factor de ruta" con todos los valores en 2.
        int[][] factorRuta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                factorRuta[i][j] = 2;
            }
        }

        // Multiplicar la matriz del terreno por la matriz de factor de ruta.
        return multiplicarMatrices(terreno, factorRuta);
    }

    /**
     * Convierte una matriz en una cadena formateada para imprimirla.
     *
     * @param matriz La matriz a imprimir.
     * @return Una cadena con el contenido de la matriz.
     */
    public static String imprimirMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sb.append(String.format("%4d", valor));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
