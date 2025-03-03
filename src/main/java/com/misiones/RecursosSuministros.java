package com.misiones;

public class RecursosSuministros {

    /**
     * Calcula la media, mínimo y máximo de un array de consumos.
     * @param consumos Array de consumos (por ejemplo, litros de agua consumidos por día)
     * @return Un array double[3] => [promedio, min, max]
     */
    public static double[] calcularEstadisticas(int[] consumos) {
        if (consumos == null || consumos.length == 0) {
            // Si no hay datos, devolvemos [0, 0, 0]
            return new double[]{0.0, 0.0, 0.0};
        }

        double suma = 0;
        int min = consumos[0];
        int max = consumos[0];

        for (int c : consumos) {
            suma += c;
            if (c < min) min = c;
            if (c > max) max = c;
        }

        double promedio = suma / consumos.length;
        return new double[]{promedio, min, max};
    }

    /**
     * Verifica si un recurso está por debajo de un umbral crítico.
     * @param consumoActual Cantidad de recurso disponible o consumo actual
     * @param umbral Umbral mínimo seguro
     * @return true si el recurso está por debajo del umbral, false en caso contrario
     */
    public static boolean alertaRecurso(double consumoActual, double umbral) {
        return consumoActual < umbral;
    }
}
