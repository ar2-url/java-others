public class MethodsExampleClass {
    public static void main(String[] args) {
        printSomeText();
        printSomeText();
        printSomeText();
        System.out.println("\n");
        printNameAndAnimal();

        printTextAsArgument("jakis moj text");
        printTextAsArgument("jakis inny text");
        printTextAsArgument(" i kolejny");

        calculateSquareOfNumber(5);
        calculateSquareOfNumber(2);    //calculateSquareOfNumbers(24); - traktuje jako INT

        byte myByte = 9;
        sumOfBytes(myByte);
        sumOfBytes(myByte);

        long Number1 = 777;
        long Number2 = 888;
        calculateLong(Number1, Number2);
        calculateLong((long) 1500, (long) 400);

        subtractTwoLongVariables(5500, 4400);

        printTextWithNumber("Ala ma lizakow", 5);


    }


    public static void printSomeText() {
        System.out.print("jakis tekst ");
        System.out.print("z kolejnym");
        System.out.print("i jeszcze ");
    }


    public static void printNameAndAnimal() {
        System.out.println("Ala ma kota");

    }

    public static void printTextAsArgument(String text) {
        System.out.println(text + text);


    }

    public static void calculateSquareOfNumber(int myNumber) {
        System.out.println(myNumber * myNumber);
    }

    public static void sumOfBytes(byte myByteNumber) {
        System.out.println(myByteNumber + myByteNumber);
    }

    public static void calculateLong(long Number1, long Number2) {
        System.out.println(Number1 + Number2);
    }

    public static void subtractTwoLongVariables(long num1, long num2) {
        System.out.println(num1 - num2);
    }

    public static void printTextWithNumber(String myText, int myNumber3) {
        int myNumber4 = myNumber3 + myNumber3;
        System.out.printf("%s %d i jest zadowolona", myText, myNumber4);

    }
    public static void printINNE(String longerText, int n1, int n2);
}
