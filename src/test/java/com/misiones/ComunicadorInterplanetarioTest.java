package com.misiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComunicadorInterplanetarioTest {

    @Test
    public void testContarVocales() {
        String mensaje = "Hola Mundo";
        // "Hola Mundo" tiene 4 vocales: o, a, u, o.
        assertEquals(4, ComunicadorInterplanetario.contarVocales(mensaje));
    }

    @Test
    public void testInvertirMensaje() {
        String mensaje = "Hola";
        String esperado = "aloH";
        assertEquals(esperado, ComunicadorInterplanetario.invertirMensaje(mensaje));
    }

    @Test
    public void testEsPalindromoTrue() {
        String mensaje = "Anita lava la tina";
        // Después de procesar, se vuelve "anitalavalatina" que es palíndromo.
        assertTrue(ComunicadorInterplanetario.esPalindromo(mensaje));
    }

    @Test
    public void testEsPalindromoFalse() {
        String mensaje = "Hola Mundo";
        assertFalse(ComunicadorInterplanetario.esPalindromo(mensaje));
    }
}
