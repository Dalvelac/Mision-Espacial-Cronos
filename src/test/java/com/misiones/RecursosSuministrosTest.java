package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursosSuministrosTest {

    @Test
    public void testCalcularEstadisticas() {
        int[] consumos = {10, 15, 20, 5, 12};
        double[] resultado = RecursosSuministros.calcularEstadisticas(consumos);

        // resultado[0] => promedio, resultado[1] => min, resultado[2] => max
        assertEquals(12.4, resultado[0], 0.001);
        assertEquals(5.0, resultado[1], 0.001);
        assertEquals(20.0, resultado[2], 0.001);
    }

    @Test
    public void testCalcularEstadisticasArrayVacio() {
        int[] consumosVacio = {};
        double[] resultado = RecursosSuministros.calcularEstadisticas(consumosVacio);

        // Si el array está vacío, devolvemos [0.0, 0.0, 0.0]
        assertEquals(0.0, resultado[0], 0.001);
        assertEquals(0.0, resultado[1], 0.001);
        assertEquals(0.0, resultado[2], 0.001);
    }

    @Test
    public void testAlertaRecurso() {
        double umbral = 10.0;

        // Caso por debajo del umbral
        double consumoActual = 8.0;
        assertTrue(RecursosSuministros.alertaRecurso(consumoActual, umbral));

        // Caso por encima del umbral
        consumoActual = 12.0;
        assertFalse(RecursosSuministros.alertaRecurso(consumoActual, umbral));
    }
}
