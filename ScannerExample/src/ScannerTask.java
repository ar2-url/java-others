import java.util.Scanner;

    public class ScannerTask {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);      // info o tym aby cos wpisal
            System.out.println("wpisz cos");
            String text = input.nextLine();             // czekaj
            input.close();                            // zamknnij strumien - lub wyciek pamieci czyli korzystanie z pamieci az do wyrzucenia
            System.out.println("Wpisano: " + text);

    }
}
