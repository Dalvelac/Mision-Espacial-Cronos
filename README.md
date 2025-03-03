# 𝕸𝖎𝖘𝖎ó𝖓 𝕰𝖘𝖕𝖆𝖈𝖎𝖆𝖑 𝕮𝖗𝖔𝖓𝖔𝖘 🚀

Misión Espacial Cronos es un sistema de software integral diseñado para asistir a la tripulación en una misión espacial con el objetivo de establecer una base en un nuevo planeta. El proyecto integra varios módulos que permiten la conversión y manejo del tiempo, gestión de recursos, monitoreo ambiental, planificación de tareas, navegación en el terreno y comunicación interplanetaria.

## 🛠️ Decisiones de Desarrollo y Proceso

A lo largo del desarrollo, tomé varias decisiones estratégicas para estructurar bien el código y optimizar la funcionalidad del sistema:

### 1️⃣ Estructura del Proyecto:

    Decidí utilizar Maven para gestionar dependencias y mantener una estructura organizada.
    Usé paquetes (com.misiones) para separar los módulos de manera modular y evitar conflictos de nombres.

### #️⃣ Manejo de Entradas del Usuario:

    Inicialmente, algunos módulos tenían valores predefinidos, pero después opté por permitir al usuario ingresar valores en todos los casos en los que fuera posible.
    Esta decisión hace que el software sea más flexible y fácil de probar con diferentes escenarios.

### 3️⃣ Pruebas Unitarias con JUnit:

    Implementé pruebas para cada módulo desde el principio para detectar errores rápidamente.
    Algunas funciones, como la multiplicación de matrices y el producto escalar, necesitaban validaciones extra para evitar errores en la ejecución.

### 4️⃣ Lógica de los Módulos:

    La idea de "tabla de tareas" en el Planificador de Tareas surgió como una metáfora de las tablas de multiplicar.
    En Alerta y Monitoreo, usé números primos como metáfora de eventos raros.
    En Navegador Estelar, la planificación de rutas se implementó con multiplicación de matrices.

### 5️⃣ Compilación y Generación de un .exe:

    Decidí primero generar un .jar ejecutable y después agregar la opción de convertirlo en .exe para facilitar la distribución.

## 📌 Descripción del Proyecto

El sistema se compone de los siguientes módulos:

    Cronómetro Cósmico:
    Convierte el tiempo en segundos (Tierra) a un equivalente en horas del nuevo planeta y muestra los límites de representación de datos para evitar errores.

    Recursos y Suministros:
    Calcula estadísticas (promedio, mínimo y máximo) a partir de consumos diarios de recursos, y genera alertas cuando los niveles están por debajo de un umbral crítico.
    Permite al usuario ingresar los valores de consumo.

    Alerta y Monitoreo:
    Monitorea variables ambientales críticas (radiación, temperatura, presión) y emite alertas si alguno se sale del rango seguro.
    Además, detecta eventos raros mediante el uso de números primos y descompone números en factores primos.

    Planificador de Tareas:
    Genera una tabla de tareas (como una tabla de multiplicar) y calcula el producto escalar de dos vectores para optimizar la asignación de carga de trabajo.
    El usuario puede ingresar las dimensiones de la tabla y los valores de los vectores.

    Navegador Estelar:
    Simula la planificación de rutas en el terreno del nuevo planeta mediante la multiplicación de matrices.
    Permite al usuario ingresar las dimensiones y los valores del terreno.

    Comunicador Interplanetario:
    Analiza mensajes entre la Tierra y la base: cuenta vocales, invierte el mensaje y verifica si es un palíndromo.

## 📂 Estructura del Proyecto

El proyecto sigue la estructura estándar de Maven:
```
Mision-Espacial-Cronos/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── misiones/
│   │               ├── Main.java
│   │               ├── CronometroCosmico.java
│   │               ├── RecursosSuministros.java
│   │               ├── AlertaMonitoreo.java
│   │               ├── PlanificadorTareas.java
│   │               ├── NavegadorEstelar.java
│   │               └── ComunicadorInterplanetario.java
│   └── test/
│       └── java/
│           └── com/
│               └── misiones/
│                   ├── CronometroCosmicoTest.java
│                   ├── RecursosSuministrosTest.java
│                   ├── AlertaMonitoreoTest.java
│                   ├── PlanificadorTareasTest.java
│                   ├── NavegadorEstelarTest.java
│                   └── ComunicadorInterplanetarioTest.java
├── pom.xml
└── README.md
```

## 🔧 Requisitos y Dependencias

- Java: 17 o superior
- Maven: Para la gestión de dependencias y compilación
    Dependencias Maven:
  
        JUnit 5 (org.junit.jupiter:junit-jupiter-api y junit-jupiter-engine)
  
        Otras dependencias transitivas necesarias

## 🚀 Compilación y Ejecución

Compilar el proyecto:

Desde la raíz del proyecto, ejecuta:
```
mvn clean package
```

Esto generará el archivo JAR en el directorio target/ (por ejemplo, Mision-Espacial-Cronos-1.0-SNAPSHOT.jar).

Ejecutar el proyecto:
```
java -jar target/Mision-Espacial-Cronos-1.0-SNAPSHOT.jar
```

Ejecutar pruebas unitarias:
```
mvn test
```

## 🎮 Uso del Sistema

El programa inicia con un menú interactivo donde el usuario puede:

### 1️⃣ Convertir tiempo entre la Tierra y el nuevo planeta.
### 2️⃣ Ingresar consumos de recursos y verificar alertas.
### 3️⃣ Monitorear condiciones ambientales y analizar números primos.
### 4️⃣ Planificar tareas generando una tabla y calculando producto escalar.
### 5️⃣ Explorar el terreno ingresando matrices y generando rutas óptimas.
### 6️⃣ Analizar mensajes ingresados por el usuario (contar vocales, invertir texto, verificar palíndromos).

Cada opción permite ingresar datos personalizados.

## 🔄 Evolución del Proyecto

✔ Inicialmente, los módulos usaban valores fijos dentro del código.

✔ Se decidió permitir entrada dinámica para hacer el programa más flexible.

✔ Se agregaron pruebas unitarias para evitar errores en cálculos.

✔ Se mejoró la estructura del código, separando la lógica y la interfaz de usuario.

✔ El proyecto está listo para futuras mejoras, como una interfaz gráfica o integración con bases de datos.
