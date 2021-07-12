public class For {
    //Inicializar en false
    static boolean isTurnOLight = false;
    public static void main(String[] args) {
        //Ejecutar metodo turnOnOffLight
        turnOnOffLight();
        //Recorrer en base al numero de iteraciones en la condicion
        for (int i = 1; i <= 10; i++) {
            printSOS();
        }

    }
    //Metodo PrintSOS
    public static void  printSOS(){
        System.out.println("*¨* * _ _ _ * * *");
    }

    //Metodo turnOnOffLight
    public static boolean turnOnOffLight(){
        isTurnOLight = (isTurnOLight)?false:true;
        return  isTurnOLight;
    }
}
