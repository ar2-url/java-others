public class MethodsWithReturnClass {
    public static void main(String[] args) {


        boolean aIsBiggerThanB = checkIfAIsBiggerThanBWithReturn(19, 40);
        System.out.println("aIsBiggerThanB: " + aIsBiggerThanB);

        compareNumbers(1, 2);
        // if - czyli warunek true or false - wykonaj kod dla spelnionego warunku albo wykonaj kod dla niespel.
        int a = 2;
        int b = 4;

        if (a > b) {
            System.out.println("a jest wieksze od b");
        } else {
            System.out.println("a nie jest wieksze od b");
        }
        System.out.println("To jest koniec programu");
    }
        /*if(3 > 2) {
            System.out.println("3 jest wieksze od 2");
        }
        System.out.println("To jest koniec programu"); */

        //public static void checkIfAIsBiggerThanB(int num1, int num2);


        public static boolean checkIfAIsBiggerThanBWithReturn(int num1, int num2) {
            if(num1 > num2) {
                return true;
            } else {
                return false;
            }
            // System.out.println("asfdvaefsdfvz"); // to nigdy sie nie wykona
    }

    public static void compareNumbers(int x, int y) {
        if(x > y) {
           System.out.println("x jest wieksze od y");
        } else {
            System.out.println("x nie jest wieksze od y");
        }
        System.out.println("to jest koniec metody");
    }
}
