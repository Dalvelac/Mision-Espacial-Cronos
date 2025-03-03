package com.misiones;

public class ComunicadorInterplanetario {

    /**
     * Cuenta el número de vocales (a, e, i, o, u) en el mensaje.
     * @param mensaje Texto a analizar.
     * @return Cantidad de vocales encontradas.
     */
    public static int contarVocales(String mensaje) {
        if (mensaje == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < mensaje.length(); i++) {
            if (vowels.indexOf(mensaje.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Invierte el mensaje.
     * @param mensaje Texto a invertir.
     * @return El mensaje invertido.
     */
    public static String invertirMensaje(String mensaje) {
        if (mensaje == null) return null;
        return new StringBuilder(mensaje).reverse().toString();
    }

    /**
     * Verifica si el mensaje es un palíndromo.
     * Se ignoran espacios, signos de puntuación y se considera sin mayúsculas.
     * @param mensaje Texto a verificar.
     * @return true si es palíndromo, false en caso contrario.
     */
    public static boolean esPalindromo(String mensaje) {
        if (mensaje == null) return false;
        // Eliminar caracteres no alfabéticos y convertir a minúsculas.
        String procesado = mensaje.replaceAll("[\\W_]", "").toLowerCase();
        String invertido = invertirMensaje(procesado);
        return procesado.equals(invertido);
    }
}
