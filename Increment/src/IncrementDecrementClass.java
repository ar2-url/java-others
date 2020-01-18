public class IncrementDecrementClass {
    public static void main(String[] args) {
        int x = 3;
        System.out.printf("x: %d\n", x);  //zmiana w trakcie dzialania programu
        x = 5;
        System.out.printf("x: %d\n", x);
        x = x + 1;
        System.out.printf("x: %d\n", x);

        System.out.printf("x++: %d\n", x++);
        System.out.printf("x: %d\n", x);      //dodaje jeden bo x++ to x+1

        //analogiczny zapis ale po drugiej stronie

        System.out.printf("++x: %d\n", ++x);  //okresla zachowanie i kolejnosc
        int y = 120;
        System.out.printf("y--: %d\n", y--);
        System.out.printf("y: %d\n", y);

        System.out.printf("--y: %d\n", --y);
    }
}
