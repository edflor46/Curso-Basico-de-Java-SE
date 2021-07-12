public class OperationsMathematic {
    public static void main(String[] args) {
        //Variables
        double x = 2.1;
        double y = 3;

        //Imprimir variables
        System.out.println("Valor X: " +  x);
        System.out.println("Valor Y: " + y);

        //Devuelve un entero hacia arriba
        System.out.println("Numero entero hacia arriba: " + Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println("Numero entero hacia abajo: " + Math.floor(x));

        //DEvuelve un numero a otro numero
        System.out.println("Devuelve un numero elevado a una potencia n: " + Math.pow(x, y));

        //Devuelve el mayor
        System.out.println("Devuelve el mayor de los numeros: " + Math.max(x, y));

        //Devuelve la Raiz cuadrada
        System.out.println("Devuelve la raiz Cuadrada: " + Math.sqrt(y));

        //CAlcular el area de un circulo
        System.out.println("Devuelve el area de un circulo: " + Math.PI * Math.pow(y, 2));

        //Area de una esfera
        System.out.println("Devuelve el area de una esfera: " + (4 * Math.PI) * Math.pow(y, 2));

        //Volumen de una esfera
        System.out.println("Devuelve el volumen de una esfera: " + (4/3) * Math.PI * Math.pow(y, 3));

    }
}
