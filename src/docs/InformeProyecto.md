# Informe del Proyecto - Misión Espacial Cronos

## 📌 Introducción

La Misión Espacial Cronos es un sistema de software diseñado para asistir a una tripulación en un planeta desconocido, proporcionando herramientas de planificación, monitoreo y comunicación. Se divide en múltiples módulos, cada uno encargado de una función específica, asegurando la optimización y seguridad de la base espacial.

Este informe describe la implementación de cada módulo, las decisiones técnicas tomadas durante el desarrollo y los desafíos enfrentados.

## ⚙️ Estructura del Proyecto

El proyecto se organizó en múltiples módulos dentro de un paquete Java (com.misiones), siguiendo una arquitectura modular para mantener el código limpio y organizado.
```
Mision-Espacial-Cronos/
├── src/main/java/com/misiones/
│   ├── Main.java
│   ├── CronometroCosmico.java
│   ├── RecursosSuministros.java
│   ├── AlertaMonitoreo.java
│   ├── PlanificadorTareas.java
│   ├── NavegadorEstelar.java
│   ├── ComunicadorInterplanetario.java
│
├── src/test/java/com/misiones/
│   ├── CronometroCosmicoTest.java
│   ├── RecursosSuministrosTest.java
│   ├── AlertaMonitoreoTest.java
│   ├── PlanificadorTareasTest.java
│   ├── NavegadorEstelarTest.java
│   ├── ComunicadorInterplanetarioTest.java
│
├── pom.xml
├── README.md
└── InformeProyecto.md
```
El proyecto utiliza Maven para la gestión de dependencias y JUnit 5 para las pruebas unitarias.

## 🛠️ Módulos del Sistema
### 1️⃣ Cronómetro Cósmico

#### 📌 Funcionalidad:

    Convierte tiempo de la Tierra en tiempo del nuevo planeta.
    Muestra los límites de los tipos de datos numéricos para evitar desbordamientos.

#### 📌 Decisiones tomadas:

    Se permitió ingresar un número de segundos manualmente en vez de usar un valor fijo.
    Se incluyó un cálculo automático de los límites de representación de datos.

#### 📌 Pruebas:

    Se verificó la conversión de unidades y la correcta identificación de límites.

### 2️⃣ Recursos y Suministros

#### 📌 Funcionalidad:

    Calcula el promedio, mínimo y máximo de consumo de recursos.
    Emite alertas cuando un recurso cae por debajo de un umbral crítico.

#### 📌 Decisiones tomadas:

    Inicialmente tenía valores fijos, pero se modificó para permitir la entrada dinámica.
    Se agregaron alertas para informar cuando los niveles de consumo son preocupantes.

#### 📌 Pruebas:

    Validación de cálculos de estadísticas con datos reales y casos extremos.

### 3️⃣ Alerta y Monitoreo

#### 📌 Funcionalidad:

    Monitorea radiación, temperatura y presión, generando alertas si los valores no son seguros.
    Utiliza números primos como metáfora de eventos raros y descompone números en factores primos.

#### 📌 Decisiones tomadas:

    Se permitió al usuario ingresar valores personalizados para el monitoreo ambiental.
    Se incluyó la funcionalidad de detectar eventos raros mediante números primos.

#### 📌 Pruebas:

    Se validó el correcto funcionamiento de las alertas con distintos rangos de valores.

### 4️⃣ Planificador de Tareas

#### 📌 Funcionalidad:

    Crea una tabla de tareas simulando una tabla de multiplicar.
    Calcula el producto escalar de vectores de carga de trabajo para distribuir eficientemente las tareas.

#### 📌 Decisiones tomadas:

    Se modificó la implementación para permitir al usuario definir la tabla y los vectores dinámicamente.
    Se implementó la verificación de que los vectores tengan la misma longitud.

#### 📌 Pruebas:

    Se realizaron pruebas para garantizar que el producto escalar y la tabla de tareas sean correctos.

### 5️⃣ Navegador Estelar

#### 📌 Funcionalidad:

    Simula la planificación de rutas en el terreno del nuevo planeta usando matrices.
    Multiplica la matriz del terreno por una matriz de "factores de ruta" para generar una ruta óptima.

#### 📌 Decisiones tomadas:

    Se permitió al usuario definir dinámicamente el tamaño de la matriz del terreno.
    Se manejaron excepciones para evitar la multiplicación de matrices incompatibles.

#### 📌 Pruebas:

    Se verificó que la multiplicación de matrices produce resultados correctos.
    Se realizaron pruebas con terrenos de distintos tamaños.

### 6️⃣ Comunicador Interplanetario

#### 📌 Funcionalidad:

    Analiza mensajes de texto contando vocales, invirtiendo el mensaje y verificando si es un palíndromo.

#### 📌 Decisiones tomadas:

    Se implementó una limpieza de texto para evaluar correctamente los palíndromos.
    Se permitió al usuario ingresar mensajes manualmente.

#### 📌 Pruebas:

    Se probaron mensajes con distintas combinaciones de mayúsculas, espacios y signos de puntuación.

## 🚧 Desafíos Encontrados y Soluciones
### 1️⃣ Manejo de Entrada del Usuario

    Problema: Inicialmente, algunos módulos usaban valores predefinidos.
    Solución: Se implementó la posibilidad de que el usuario ingrese sus propios valores.

### 2️⃣ Errores en Multiplicación de Matrices

    Problema: Se generaban errores al intentar multiplicar matrices incompatibles.
    Solución: Se agregó una validación para verificar que las dimensiones sean compatibles.

### 3️⃣ Manejo de Excepciones

    Problema: En el Planificador de Tareas, si los vectores no tenían la misma longitud, se producía un error.
    Solución: Se lanzó una excepción controlada con un mensaje explicativo para el usuario.

### 4️⃣ Problema con JUnit y Maven

    Problema: Al inicio, IntelliJ no reconocía las dependencias de JUnit.
    Solución: Se corrigió la configuración de pom.xml y se recargó Maven.

## 🎯 Conclusión

El proyecto Misión Espacial Cronos logró integrar múltiples funcionalidades en una aplicación modular y flexible. Se permitió al usuario ingresar valores en todos los módulos posibles, asegurando personalización y facilidad de uso. A lo largo del desarrollo se mejoró la estructura del código, la gestión de errores y la validación de datos.

Este informe deja documentado el proceso y las decisiones tomadas durante el desarrollo. ¡Misión cumplida! 🚀
