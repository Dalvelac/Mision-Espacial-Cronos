package com.misiones;

public class PlanificadorTareas {

    /**
     * Calcula el producto escalar de dos vectores.
     * @param vector1 Primer vector.
     * @param vector2 Segundo vector.
     * @return El producto escalar.
     * @throws IllegalArgumentException si los vectores tienen longitudes diferentes.
     */
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud.");
        }
        int producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }

    /**
     * Genera una tabla de tareas en formato de tabla de multiplicar.
     * @param filas Número de filas.
     * @param columnas Número de columnas.
     * @return Una cadena que representa la tabla.
     */
    public static String generarTablaTareas(int filas, int columnas) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                sb.append(String.format("%4d", i * j));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
