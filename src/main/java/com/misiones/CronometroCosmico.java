package com.misiones;

public class CronometroCosmico {

    private static final double HORA_PLANETA_POR_HORA_TIERRA = 20.0 / 24.0;

    /**
     * Convierte un valor en segundos de la Tierra a horas en el nuevo planeta.
     *
     * @param segundosTierra Segundos transcurridos en la Tierra
     * @return Horas equivalentes en el nuevo planeta
     */
    public static double convertirSegundosATiempoPlaneta(long segundosTierra) {
        double horasTierra = segundosTierra / 3600.0;
        return horasTierra * HORA_PLANETA_POR_HORA_TIERRA;
    }

    /**
     * Muestra los límites de representación de datos primordiales (int, long, etc.)
     * para evitar problemas de overflow en la misión.
     */
    public static void mostrarLimites() {
        System.out.println("===== Límites de Representación de Datos =====");
        System.out.println("int  (32 bits)   -> Mín: " + Integer.MIN_VALUE  + " / Máx: " + Integer.MAX_VALUE);
        System.out.println("long (64 bits)   -> Mín: " + Long.MIN_VALUE     + " / Máx: " + Long.MAX_VALUE);
        System.out.println("float (32 bits)  -> Mín: " + Float.MIN_VALUE    + " / Máx: " + Float.MAX_VALUE);
        System.out.println("double (64 bits) -> Mín: " + Double.MIN_VALUE   + " / Máx: " + Double.MAX_VALUE);
        System.out.println("===============================================");
    }
}
