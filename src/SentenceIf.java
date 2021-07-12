public class SentenceIf {
    public static void main(String[] args) {
        int a = 8, b = 5;

        System.out.println("A es igual a b -> " + (a == b));
        System.out.println("A es diferente de b -> " + (a != b));

        System.out.println("A es mayor que b -> " + (a > b));
        System.out.println("A es menor que b -> " + (a < b));

        System.out.println("A es mayor igual que b -> " + (a >= b));
        System.out.println("A es menor igual que b -> " + (a <= b));

        if (a == b){
            System.out.println("A es igual a B");
        }else if (a != b){
            System.out.println("A no es igual que B");
        }else if (a < b){
            System.out.println("A es menor que B");
        }else if (a > b){
            System.out.println("A es mayor que B");
        }else if (a <= b){
            System.out.println("A es menor igual que B");
        }else if (a >= b){
            System.out.println("A es mayor igual que B");
        }

    }
}
