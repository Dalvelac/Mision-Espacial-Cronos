package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CronometroCosmicoTest {

    @Test
    public void testConvertirSegundosATiempoPlaneta() {
        long segundosTierra = 3600; // 1 hora en segundos
        double resultado = CronometroCosmico.convertirSegundosATiempoPlaneta(segundosTierra);

        assertEquals(0.8333, resultado, 0.0001,
                "La conversión de 1 hora Tierra a horas planeta no es la esperada");
    }

    @Test
    public void testConvertirSegundosCero() {
        long segundosTierra = 0;
        double resultado = CronometroCosmico.convertirSegundosATiempoPlaneta(segundosTierra);

        assertEquals(0.0, resultado, 0.0001,
                "Si el tiempo en Tierra es 0, en el planeta también debe ser 0");
    }
}
