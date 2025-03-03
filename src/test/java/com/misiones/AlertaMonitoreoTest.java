package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AlertaMonitoreoTest {

    @Test
    public void testMonitorearAmbienteTodoSeguro() {
        // Valores seguros: radiación 50, temperatura 20, presión 100
        boolean seguro = AlertaMonitoreo.monitorearAmbiente(50, 20, 100);
        assertTrue(seguro, "El ambiente debería estar en condiciones seguras.");
    }

    @Test
    public void testMonitorearAmbienteRadiacionAlta() {
        // Radiación fuera del rango seguro
        boolean seguro = AlertaMonitoreo.monitorearAmbiente(150, 20, 100);
        assertFalse(seguro, "El ambiente debería generar alerta por radiación alta.");
    }

    @Test
    public void testEsPrimo() {
        assertTrue(AlertaMonitoreo.esPrimo(7), "7 debe ser primo");
        assertFalse(AlertaMonitoreo.esPrimo(10), "10 no es primo");
    }

    @Test
    public void testDescomponerEnPrimos() {
        // Ejemplo: 60 = 2, 2, 3, 5
        List<Integer> factores = AlertaMonitoreo.descomponerEnPrimos(60);
        assertEquals(4, factores.size(), "60 debe tener 4 factores primos");
        assertEquals(2, factores.get(0));
        assertEquals(2, factores.get(1));
        assertEquals(3, factores.get(2));
        assertEquals(5, factores.get(3));
    }

    @Test
    public void testPrimerosPrimos() {
        List<Integer> primos = AlertaMonitoreo.primerosPrimos(5);
        // Los primeros 5 números primos son 2, 3, 5, 7, 11
        assertEquals(5, primos.size());
        assertEquals(2, primos.get(0));
        assertEquals(3, primos.get(1));
        assertEquals(5, primos.get(2));
        assertEquals(7, primos.get(3));
        assertEquals(11, primos.get(4));
    }
}
