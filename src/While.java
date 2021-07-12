public class While {
    //Variable global inicializada en false
    static  boolean isTurnOnLight = false;
    public static void main(String[] args) {
        //Inicializar metodo turnOnOffLight
        turnOnOffLight();

        //Si la variable global viene true, imprimir SOS mediante un bucle while

        //Iniciar contador
        int i = 1;
        //Condicion: si turnOnOffLight es true y el contador es <= 10
        while (isTurnOnLight && i <= 10){
            //Si se cumple la condicion ejecutar el metodo printSOS
            printSOS();
            i++;
        }

    }

    //Imprimir SOS
    public static void printSOS(){
        System.out.println("- - - _ _ _ . . .");
    }

    //Devuelve el estado de la variable global
    public static boolean turnOnOffLight(){
        //Ternario: si la variable global viene true, entonces retornar un false
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
