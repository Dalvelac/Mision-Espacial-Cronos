package com.misiones;

import java.util.ArrayList;
import java.util.List;

public class AlertaMonitoreo {

    /**
     * @param radiacion Valor de radiación
     * @param temperatura Valor de temperatura
     * @param presion Valor de presión
     * @return true si todos los valores están en rango seguro, false en caso contrario.
     */
    public static boolean monitorearAmbiente(double radiacion, double temperatura, double presion) {
        boolean seguro = true;
        if (radiacion < 0 || radiacion > 100) {
            System.out.println("Alerta: Radiación fuera del rango seguro.");
            seguro = false;
        }
        if (temperatura < -50 || temperatura > 50) {
            System.out.println("Alerta: Temperatura fuera del rango seguro.");
            seguro = false;
        }
        if (presion < 90 || presion > 110) {
            System.out.println("Alerta: Presión fuera del rango seguro.");
            seguro = false;
        }
        return seguro;
    }

    /**
     * Verifica si un número es primo.
     *
     * @param numero Número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    /**
     * Descompone un número en sus factores primos.
     *
     * @param numero Número a descomponer.
     * @return Lista de factores primos.
     */
    public static List<Integer> descomponerEnPrimos(int numero) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        return factores;
    }

    /**
     * Devuelve los primeros N números primos.
     *
     * @param N Cantidad de números primos a generar.
     * @return Lista de los primeros N números primos.
     */
    public static List<Integer> primerosPrimos(int N) {
        List<Integer> primos = new ArrayList<>();
        int num = 2;
        while (primos.size() < N) {
            if (esPrimo(num)) {
                primos.add(num);
            }
            num++;
        }
        return primos;
    }
}
