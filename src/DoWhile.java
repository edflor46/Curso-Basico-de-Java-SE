import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        //Respuesta del usuario
        int response = 0;

        //Mientras se cumpla condicion mostrar el menu
        do {
            System.out.println("Selecciona el numero de la opcion deseada; ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            //Recibir datos mediante el teclado
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            //Validar opcion seleccionada
            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("SEries");
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
            //Condicion a cumplir
        } while (response != 0);
        //Si no se cumple salir del programa
        System.out.println("Se termino el programa");
    }
}
