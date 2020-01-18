public class Main {

    public static void main(String[] args) {
        int result = Calculator.add(5,9);
        System.out.println(result);

        result = Calculator.add(1,5,8);
        System.out.println(result);

        int[] intArray = {30,40,50,60,70,80,-23};
        result = Calculator.add(intArray);
        System.out.println(result);

        result = Calculator.add(543,767,855,1,34,456,65);
        System.out.println(result);

        printTexts("SDA", "SOFTWARE", "DEVELOPMENT", "ACADEMY");
        printTexts("sda", "SOFT", "DEV", "AC");
    }

    public static void printTexts(String... texts) {
        for(int i = 0; i < texts.length; i++) {
            System.out.println(texts[i]);
        }
    }
}
