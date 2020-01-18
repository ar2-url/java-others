import java.util.Scanner;

public class ScannerNumberOrderClass {

    // 123 to rosna
    // 321 to maleja
    // 2,1,3 to ani rosna ani maleja

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = in.nextInt();
        System.out.println("podaj druga liczbe");
        int b = in.nextInt();
        System.out.println("podaj trzecia liczbe");
        int c = in.nextInt();
        in.close();

        if(a < b && b < c) {
        System.out.println("kolejnosc rosnaca");
    } else if(a > b && b > c) {
        System.out.println("kolejnosc malejaca");
    } else

    {
        System.out.println("kolejnosc ani rosnaca ani malejaca");
    }
    }
}
