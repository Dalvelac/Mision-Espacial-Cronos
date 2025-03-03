package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanificadorTareasTest {

    @Test
    public void testCalcularProductoEscalar() {
        int[] v1 = {1, 2, 3};
        int[] v2 = {4, 5, 6};
        int expected = 1*4 + 2*5 + 3*6; // 4 + 10 + 18 = 32
        int result = PlanificadorTareas.calcularProductoEscalar(v1, v2);
        assertEquals(expected, result, "El producto escalar calculado no es correcto.");
    }

    @Test
    public void testCalcularProductoEscalarVectoresDeDiferenteLongitud() {
        int[] v1 = {1, 2};
        int[] v2 = {3};
        assertThrows(IllegalArgumentException.class, () -> PlanificadorTareas.calcularProductoEscalar(v1, v2));
    }

    @Test
    public void testGenerarTablaTareas() {
        String tabla = PlanificadorTareas.generarTablaTareas(3, 3);
        // Se espera una tabla similar a:
        // "   1   2   3\n   2   4   6\n   3   6   9\n"
        assertTrue(tabla.contains("   9"), "La tabla de tareas generada es incorrecta.");
    }
}
