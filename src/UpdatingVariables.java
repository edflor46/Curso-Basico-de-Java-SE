public class UpdatingVariables {
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
    }

