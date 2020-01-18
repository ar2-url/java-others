public class WhileExampleClass {      //PETLA
    public static void main(String[] args) {
        runWhileExample(10);

        runDoWhileExample();
    }

    public static void runWhileExample(int numberOfCalls) {
        while(numberOfCalls > 0) {
            System.out.println("czesc tu petla while raz: " + numberOfCalls);
            numberOfCalls--; // zmniejsza o 1
        }
    }

    public static void runDoWhileExample() {
        int counter = 1;
        do {
            System.out.println("counter : " + counter);
            counter++;
        } while (counter < 15);
    }
}
