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

<pre>
    <code>
        public static void main (String[] args) {
  // acciones
}</code>
</pre>

**Demo:**
![Hola_Mundo](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626045747/Academia-Java.-CDMX/Java-Basico-SE/Hola_Mundo_lswacs.png)

### Variables

Una variable es un espacio de memoria (RAM) que contiene un dato de tipo numérico, booleano, de texto u otros tipos de datos un poco más complejos.

Las variables en Java se componen de un nombre único y un valor que puede cambiar a lo largo de la ejecución del programa. Al declarar las variables debemos definir el tipo de dato que vamos a usar y un punto y coma al final:

<pre>
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
}</code>
</pre>

**Demo:**
![Variables](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626047065/Academia-Java.-CDMX/Java-Basico-SE/Variables_oj8i4k.png)

### Actualizar variables
Java nos permite actualizar nuestras variables reutilizando los valores que tenían anteriormente, de esta forma evitamos errores o inconsistencias en nuestro código:

<pre><code>public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono 200
        salary += 200;
        System.out.println(salary);

        //Pension 50
        salary -= 50;
        System.out.println(salary);

        //2 hrs extras 30 c/u
        //comida: 45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeedName = "Eduardo Flores";
        employeedName = employeedName + " Ramirez";
        System.out.println(employeedName);

        employeedName = "Luis " + employeedName;
        System.out.println(employeedName);
    }
}</code></pre>
**Demo:**
![Actualizacion_Variables](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626047690/Academia-Java.-CDMX/Java-Basico-SE/ActualizandoVariables_ptht8y.png)

### Convención de Nombres
Una convención de nombres es un patrón que deben seguir los nombres de las variables para que el código esté organizado, entendible y sin repetidos.

**Java** es sensible a mayúsculas y minúsculas, este punto es clave al seguir una convención.

- Las variables siempre deben comenzar con un simbolo de letra, $ o _.

- No puedes usar el simbolo - en ninguna parte de la variable.

- Las variables constantes son variables cuyo valor nunca va a cambiar, por lo que se deben escribir completamente en mayúsculas y usando el caracter _.

**Demo:**
![Naming_variables](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626048201/Academia-Java.-CDMX/Java-Basico-SE/NamingVariables_xn0lzh.png)

### Tipos de datos numéricos
Tipos de datos para números enteros (sin decimales):

**byte:** Ocupa 1 byte de memoria y su rango es de -128 hasta 127.

**short:** Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.

**int:** Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. Es muy cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande como para desperdiciar mucha memoria. Puede almacenar hasta 10 dígitos.

**long:** Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.


Tipos de datos para números flotantes (con decimales):

**float:** Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final.

**double:** Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.

**Demo:**
![DataTypes](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626049241/Academia-Java.-CDMX/Java-Basico-SE/DataTypes_ekx7ez.png)

### Tipos de datos char y boolean
**char:** Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles.

**boolean:** Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito.

![Data_Boolean_Char](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626049641/Academia-Java.-CDMX/Java-Basico-SE/CharBoolean_xmn9kk.png)

### Operadores de Asignación, Decremento e Incremento

**Operadores de asignación:**

<code>+=: a += b es equivalente a a = a + b.
-=: a -= b es equivalente a a = a - b.
*=: a *= b es equivalente a a = a * b.
/=: a /= b es equivalente a a = a / b.
%=: a %= b es equivalente a a = a % b.</code>

**Operadores de incremento:**

<code>++: i++ es equivalente a i = i + 1.
--: i-- es equivalente a i = i - 1.</code>

**Demo:**
![Operadors](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626050836/Academia-Java.-CDMX/Java-Basico-SE/Captura_de_pantalla_119_gtc8pw.png)

### Operaciones Matemáticas

**Math** es una clase de Java que nos ayuda a ejecutar diferentes operaciones matemáticas:

- Math.PI // 3.141592653589793
- Math.E // 2.718281828459045

- Math.ceil(2.1) // 3.0 (redondear hacia arriba)
- Math.floar(2.1) // 2.0 (redondear hacia abajo)

- Math.pow(2, 3) // 8.0 (número elevado a una potencia)
- Math.sqrt(3) // 1.73... (raíz cuadrada)

- Math.max(2, 3) // 3.0 (el número más grande)

// Área de un círculo (PI * r^2):
- Math.PI * Math.pow(r, 2)

// Área de una esfera (4 * PI * r^2):
- 4 * Math.PI * Math.pow(r, 2)

// Volumen de una esfera ( (4/3) * PI * r^3):
- (4/3) * Math.PI * Math.pow(r, 3)

**Demo:**
![Operaciones_Mat](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626051689/Academia-Java.-CDMX/Java-Basico-SE/Operaciones_Mat_rxud6r.png)

### Cast
En la programación hay situaciones donde necesitamos cambiar el tipo de dato de nuestras variables, esto lo conocemos como Cast.

**Demo:**
![Cast](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626051973/Academia-Java.-CDMX/Java-Basico-SE/Cast_h5qp8w.png)

### Sentencia IF
Los condicionales son la forma en que las computadoras toman decisiones, evaluaran si la condición para ejecutar una parte del código se cumple. Si el resultado de la operación es verdadero ejecutarán esta parte del código, en caso de que no, seguirán con las siguientes instrucciones.

La forma de programar condicionales es usando la sentencia **``IF``**

**Demo:**
![IF](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626052400/Academia-Java.-CDMX/Java-Basico-SE/if_s13fpm.png)

### Sentencia Switch
La sentencia Switch nos ayuda a tomar decisiones con base en una o más condiciones

**Demo:**
![Switch](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626061902/Academia-Java.-CDMX/Java-Basico-SE/Switch_1_vyooss.png)

### Funciones
Las funciones nos ayudan a ejecutar código que dependiendo de las opciones que le enviemos, transformará y devolverá un cierto resultado. Gracias a las funciones podemos organizar, modularizar, reutilizar y evitar repetidos en nuestro código.

Todas nuestras funciones deben tener un nombre. Opcionalmente, pueden recibir argumentos y devolver un resultado. También debemos especificar el tipo de dato de nuestros argumentos y el resultado final de nuestra función.

<pre><code>
public int suma(inta, int b) {
  return a + b;
}</code></pre>

**Demo:**
![Functions](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626060723/Academia-Java.-CDMX/Java-Basico-SE/functions_aoax0l.png)

### Bucle do While

Los bucles (ciclos) nos ayudan a ejecutar una parte de nuestro código una cantidad de veces hasta que se cumpla alguna condición y podamos continuar con la ejecución de nuestro código.

Existen diferentes bucles. Por ejemplo, el bucle do while:

<pre>
    <code>do {
  // instrucciones
} while (condición);</code>
</pre>

**Demo:**
![DoWhile](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626061113/Academia-Java.-CDMX/Java-Basico-SE/DoWhile_eteywl.png)

### Bucle While
El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla.

<pre>
   <code>while (isTurnOnLight) {
  printSOS();
}</code> 
</pre>

**Demo:**
![While](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626061389/Academia-Java.-CDMX/Java-Basico-SE/While_smqtj4.png)

### Bucle For

El Ciclo For también nos ayuda a ejecutar una parte de nuestro código las veces que sean necesarias para que se cumpla una condición. De hecho, el ciclo FOR nos da muchas ayudas para lograr este resultado de la forma más fácil posible:

<pre>
    <code>// En este ejemplo el mensaje de printSOS se<br>
// ejecutará 10 veces:<br>
for (int i = 1; i <= 10; i++) {<br>
  printSOS();<br>
}</code>
</pre>

**Demo:**
![FOR](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626061975/Academia-Java.-CDMX/Java-Basico-SE/For_kp2kfk.png)

### Arrays
Los arreglos o arrays son objetos en los que podemos guardar más de una variable, una lista de elementos. Los arrays son de una sola dimensión, pero si guardamos arrays dentro de otros arrays podemos obtener arrays multidimensionales.

Los arrays se definen en código de las siguientes maneras:

``TipoDato[] nombreVariable = new TipoDato[capacidad];``

![Array](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626062244/Academia-Java.-CDMX/Java-Basico-SE/Arrays_x9d3e8.png)

### Ciclos For anidados

Los ciclos FOR nos ayudan a ejecutar una parte de nuestro código todas las veces que sean necesarias hasta que una condición se cumpla, por ejemplo, que un número supere o iguale cierta cantidad.

![For_Anidado](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626062589/Academia-Java.-CDMX/Java-Basico-SE/For_anidado_jusz5s.png)
