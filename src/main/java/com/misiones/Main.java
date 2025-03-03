package com.misiones;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("===== Misión Espacial Cronos =====");
            System.out.println("1. Cronómetro Cósmico");
            System.out.println("2. Recursos y Suministros");
            System.out.println("3. Alerta y Monitoreo");
            System.out.println("4. Planificador de Tareas");
            System.out.println("5. Navegador Estelar");
            System.out.println("6. Comunicador Interplanetario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Módulo Cronómetro Cósmico (ya implementado)
                    System.out.print("Ingresa el tiempo en segundos (Tierra): ");
                    long segundos = sc.nextLong();
                    double horasPlaneta = CronometroCosmico.convertirSegundosATiempoPlaneta(segundos);
                    System.out.println("Equivale a " + horasPlaneta + " horas en el nuevo planeta.");
                    CronometroCosmico.mostrarLimites();
                    break;
                case 2:
                    // Módulo Recursos y Suministros (mejorado para entrada dinámica)
                    System.out.println("== Módulo de Recursos y Suministros ==");
                    System.out.print("¿Cuántos días de consumo deseas ingresar? ");
                    int dias = sc.nextInt();
                    int[] consumos = new int[dias];
                    for (int i = 0; i < dias; i++) {
                        System.out.print("Ingresa el consumo del día " + (i + 1) + ": ");
                        consumos[i] = sc.nextInt();
                    }
                    double[] stats = RecursosSuministros.calcularEstadisticas(consumos);
                    System.out.println("Promedio: " + stats[0]);
                    System.out.println("Mínimo: " + stats[1]);
                    System.out.println("Máximo: " + stats[2]);
                    System.out.print("Ingresa el umbral crítico para la alerta: ");
                    double umbral = sc.nextDouble();
                    System.out.print("Ingresa el recurso actual: ");
                    double recursoActual = sc.nextDouble();
                    if (RecursosSuministros.alertaRecurso(recursoActual, umbral)) {
                        System.out.println("¡Alerta! Recurso por debajo del umbral: " + recursoActual);
                    } else {
                        System.out.println("Recurso en niveles seguros: " + recursoActual);
                    }
                    break;
                case 3:
                    // Módulo Alerta y Monitoreo (ya implementado)
                    System.out.println("== Módulo de Alerta y Monitoreo ==");
                    System.out.print("Ingresa la radiación: ");
                    double rad = sc.nextDouble();
                    System.out.print("Ingresa la temperatura: ");
                    double temp = sc.nextDouble();
                    System.out.print("Ingresa la presión: ");
                    double pres = sc.nextDouble();
                    boolean ambienteSeguro = AlertaMonitoreo.monitorearAmbiente(rad, temp, pres);
                    if (ambienteSeguro) {
                        System.out.println("El ambiente está en condiciones seguras.");
                    } else {
                        System.out.println("Se detectaron anomalías en el ambiente.");
                    }
                    System.out.print("¿Cuántos eventos raros (números primos) deseas listar? ");
                    int n = sc.nextInt();
                    List<Integer> primos = AlertaMonitoreo.primerosPrimos(n);
                    System.out.println("Los primeros " + n + " números primos son: " + primos);
                    System.out.print("Ingresa un número para descomponer en factores primos: ");
                    int num = sc.nextInt();
                    List<Integer> factores = AlertaMonitoreo.descomponerEnPrimos(num);
                    System.out.println("Los factores primos de " + num + " son: " + factores);
                    break;
                case 4:
                    // Módulo Planificador de Tareas (mejorado para entrada dinámica)
                    System.out.println("== Módulo de Planificador de Tareas ==");
                    System.out.print("Ingresa el número de filas para la tabla de tareas: ");
                    int filasTabla = sc.nextInt();
                    System.out.print("Ingresa el número de columnas para la tabla de tareas: ");
                    int columnasTabla = sc.nextInt();
                    String tabla = PlanificadorTareas.generarTablaTareas(filasTabla, columnasTabla);
                    System.out.println("Tabla de tareas generada:");
                    System.out.println(tabla);
                    System.out.print("Ingresa la longitud de los vectores de carga de trabajo: ");
                    int longitud = sc.nextInt();
                    int[] vector1 = new int[longitud];
                    int[] vector2 = new int[longitud];
                    System.out.println("Ingresa los valores del primer vector:");
                    for (int i = 0; i < longitud; i++) {
                        System.out.print("Valor " + (i + 1) + ": ");
                        vector1[i] = sc.nextInt();
                    }
                    System.out.println("Ingresa los valores del segundo vector:");
                    for (int i = 0; i < longitud; i++) {
                        System.out.print("Valor " + (i + 1) + ": ");
                        vector2[i] = sc.nextInt();
                    }
                    try {
                        int producto = PlanificadorTareas.calcularProductoEscalar(vector1, vector2);
                        System.out.println("El producto escalar es: " + producto);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    // Módulo Navegador Estelar (con entrada dinámica)
                    System.out.println("== Módulo de Navegador Estelar ==");
                    System.out.print("Ingresa el número de filas del terreno: ");
                    int f = sc.nextInt();
                    System.out.print("Ingresa el número de columnas del terreno: ");
                    int c = sc.nextInt();
                    int[][] terreno = new int[f][c];
                    System.out.println("Ingresa los valores del terreno:");
                    for (int i = 0; i < f; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print("Valor en [" + i + "][" + j + "]: ");
                            terreno[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("Terreno ingresado:");
                    System.out.println(NavegadorEstelar.imprimirMatriz(terreno));
                    int[][] rutaPlanificada = NavegadorEstelar.planificarRuta(terreno);
                    System.out.println("Ruta planificada:");
                    System.out.println(NavegadorEstelar.imprimirMatriz(rutaPlanificada));
                    break;
                case 6:
                    // Módulo Comunicador Interplanetario
                    System.out.println("== Módulo de Comunicador Interplanetario ==");
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingresa un mensaje: ");
                    String mensaje = sc.nextLine();
                    int numVocales = ComunicadorInterplanetario.contarVocales(mensaje);
                    String invertido = ComunicadorInterplanetario.invertirMensaje(mensaje);
                    boolean palindromo = ComunicadorInterplanetario.esPalindromo(mensaje);
                    System.out.println("Número de vocales: " + numVocales);
                    System.out.println("Mensaje invertido: " + invertido);
                    if (palindromo) {
                        System.out.println("El mensaje es un palíndromo.");
                    } else {
                        System.out.println("El mensaje no es un palíndromo.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
