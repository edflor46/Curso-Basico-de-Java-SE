public class SentenceSwitch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionates Light mode");
                break;

            case "Night":
                System.out.println("Seleccionaste Night mode");
                break;

            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark mode");
                break;

            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;

            default:
                System.out.println("Selecciona una opcion valida");
                break;
        }


    }
    }

