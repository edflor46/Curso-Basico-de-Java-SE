# Curso Básico de Java SE

## Java y JDK

El **JDK** o **Java Development Kit** se compone de los siguientes elementos:

**Java Runtime Environment (JRE):** La máquina virtual de Java, lo que nos permite que al escribir el mismo código funcione igual en todos los dispositivos y sistemas operativos.

**Compilador de Java:** El encargado de traducir nuestro código en Java a un lenguaje que puede entender e interpretar nuestra máquina virtual.

**APIs de desarrollo:** Una base de código lista para ayudarnos a desarrollar.

## Las herramientas más usadas de Java

Java 8 (LTS) es la versión más usada de Java hasta inicios del 2019, pero solo tuvo soporte hasta diciembre del 2020, luego de esta fecha se tendra que pagar una licencia para continuar con su soporte.

Java 10 introdujo algunos cambios en la forma de declarar variables.

La herramienta más usada para construir proyectos web con **Java** es **Maven**, pero también existen otras alternativas como **Gradle**. También existen frameworks como **Spring** para trabajar con **Java EE** y **ORMs** como **Hibernate** para trabajar con bases de datos.

Los **IDEs** son entornos de desarrollo integrados, herramientas (aplicaciones, seguramente de escritorio) que nos ayudan a escribir nuestro código con editores, compiladores, depuradores y constructores de interfaces gráficas, todo en un mismo lugar.

El **IDE** recomendado por **Oracle** es **NetBeans**, pero también están **Eclipse** e **IntelliJ IDEA**, este último es el que más fuerza ha tomado gracias a **Kotlin**. Las tres herramientas son gratuitas, pero **IntelliJ IDEA** también tiene una versión de pago.

## Ejercicios

### Hola mundo

Los archivos de **Java** usan la extensión **.java**. Por lo tanto, para crear nuestro primer **“Hola, mundo”** podemos hacerlo desde un archivo **HolaMundo.java.**

El método **main** es el punto de entrada de una aplicación en diferentes lenguajes como **Java**, **Kotlin** y **C++**. Sin este método nuestra aplicación no se ejecutará y mostrará un error.

En Java definimos este método de la siguiente manera:

<p>
    <code>
        public static void main (String[] args) {
  // acciones
}
    </code>
</p>

**Demo:**
![Hola_Mundo](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626045747/Academia-Java.-CDMX/Java-Basico-SE/Hola_Mundo_lswacs.png)

### Variables

Una variable es un espacio de memoria (RAM) que contiene un dato de tipo numérico, booleano, de texto u otros tipos de datos un poco más complejos.

Las variables en Java se componen de un nombre único y un valor que puede cambiar a lo largo de la ejecución del programa. Al declarar las variables debemos definir el tipo de dato que vamos a usar y un punto y coma al final:

<p>
<code>public class Variables {public static void main(String[] args) {<br>
// Declarar la variable speed de tipo int (números enteros)
    int spped;

    // Actualizar el contenido de la variable speed:
    spped = 10; // si ya habías declarado la variable

    // Declarar una variable y asignarle un valor al mismo tiempo:
    int salary = 1000;

    // Crear una variable de tipo String:
    String eployeeName = "Eduardo Flores";
  }
}
</code>
</p>

**Demo:**
![Variables](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626047065/Academia-Java.-CDMX/Java-Basico-SE/Variables_oj8i4k.png)


