package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NavegadorEstelarTest {

    @Test
    public void testMultiplicarMatrices() {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        int[][] esperado = {
                {19, 22},
                {43, 50}
        };
        int[][] resultado = NavegadorEstelar.multiplicarMatrices(A, B);
        // Comparar fila por fila
        assertEquals(esperado.length, resultado.length, "El número de filas no coincide.");
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i], "La fila " + i + " no coincide.");
        }
    }

    @Test
    public void testMultiplicarMatricesDimensionIncompatible() {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] B = {
                {7, 8},
                {9, 10}
        };
        assertThrows(IllegalArgumentException.class, () -> NavegadorEstelar.multiplicarMatrices(A, B));
    }

    @Test
    public void testPlanificarRuta() {
        // Usamos un terreno de 2x2
        int[][] terreno = {
                {1, 2},
                {3, 4}
        };
        // La matriz factorRuta tendrá todos sus valores en 2.
        // Entonces, la multiplicación:
        // [ [1*2+2*2, 1*2+2*2],
        //   [3*2+4*2, 3*2+4*2] ] =
        // [ [6, 6],
        //   [14, 14] ]
        int[][] esperado = {
                {6, 6},
                {14, 14}
        };
        int[][] ruta = NavegadorEstelar.planificarRuta(terreno);
        assertEquals(esperado.length, ruta.length, "El número de filas no coincide.");
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], ruta[i], "La fila " + i + " no coincide.");
        }
    }
}
