public class Functions {
    public static void main(String[] args) {
        //Area de circulo
        //pi * r2
        double y = 3;
        double areaCircle = circleArea(y);
        System.out.println("Area del circulo: " + areaCircle);

        //Area de una esfera
        //4*pi*r2
        double areaSphere = sphereArea(y);
        System.out.println("Area de la esfera: " + areaSphere);

        //Volumen de una esfera
        double VolumenSphere = sphereVolumen(y);
        System.out.println("El volumen de la esfera es: " + VolumenSphere);

        //Pesos a dolares
        System.out.println("Pesos a dolares: " + converToDolar(200,  "MXN"));



    }

    //Metodo para calcular el area
    public static double circleArea(double r){
        return  Math.PI * Math.pow(r, 2);
    }

    //Metodo para calcular el metodo de una esfera
    public  static  double sphereArea(double r){
        return 4 * Math.PI*Math.pow(r, 2);
    }

    //Metodo para calcular el Volumen de una esfera
    public static  double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de moneda
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity: Devuelve la cantidad actualizada en dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;

            case  "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
