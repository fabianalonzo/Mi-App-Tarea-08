# Aplicación Android con Fragments y Navigation Drawer

Proyecto desarrollado en Android Studio utilizando Java, Fragments y Navigation Drawer. La aplicación permite realizar diferentes operaciones matemáticas distribuidas en varias pantallas mediante un menú lateral de navegación.

## Funcionalidades

### Préstamo
Realiza la suma de dos números ingresados por el usuario.

- Entrada:
  - Primer número
  - Segundo número
- Salida:
  - Resultado de la suma

### Recepción
Realiza la multiplicación de dos números ingresados por el usuario.

- Entrada:
  - Primer número
  - Segundo número
- Salida:
  - Resultado de la multiplicación

### Historial
Permite identificar el tipo de triángulo a partir de las medidas de sus tres lados.

- Entrada:
  - Lado 1
  - Lado 2
  - Lado 3
- Salida:
  - Triángulo Equilátero
  - Triángulo Isósceles
  - Triángulo Escaleno
  - No es un triángulo

### Configuración
Calcula la sumatoria desde 1 hasta un número N utilizando estructuras repetitivas.

- Entrada:
  - Número N
- Salida:
  - Resultado de la sumatoria

## Tecnologías utilizadas

- Java
- Android Studio
- Fragments
- Navigation Drawer
- XML
- Material Design

## Estructura del proyecto

```
app/
├── java/
│   └── com.example.miapp/
│       ├── MainActivity.java
│       └── fragments/
│           ├── PrestamoFragment.java
│           ├── RecepcionFragment.java
│           ├── HistorialFragment.java
│           └── ConfiguracionFragment.java
│
└── res/
    ├── layout/
    │   ├── fragment_prestamo.xml
    │   ├── fragment_recepcion.xml
    │   ├── fragment_historial.xml
    │   └── fragment_configuracion.xml
    └── drawable/
        ├── bg_input.xml
        └── bg_button.xml
```

## Instalación

1. Clonar el repositorio.

```bash
git clone https://github.com/fabianalonzo2006/nombre-del-repositorio.git
```

2. Abrir el proyecto en Android Studio.

3. Sincronizar las dependencias de Gradle.

4. Ejecutar la aplicación en un dispositivo físico o emulador Android.

## Autor

Fabian Alonzo

GitHub: https://github.com/fabianalonzo2006
