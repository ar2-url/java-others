public class SwitchExampleClass {
    public static void main(String[] args) {
        basicMathExampleWithBreak("+", 5, 2);    // tu i na dole musi byc dokladnie to samo
        basicMathExampleWithBreak("-", 3, 2);
        basicMathExampleWithBreak("*", 6, 8);
        basicMathExampleWithBreak("/", 3, 0);

        double result = basicMathExampleWithReturn("+", 5, 4);  //gdy zmiana dzialania to wybieram * lub / lub -

        System.out.println(result);
    }

    public static void basicMathExampleWithBreak(String symbol, int a, int b) {
        switch(symbol) {

            case "+": {                                                     // i tu
                System.out.println(a+b);
                break;
            }
            case "-": {
                System.out.println(a-b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                if(b == 0) {
                    System.out.println("co robisz lobuzie!");
                } else {
                    System.out.println(a / b);
                }
                break;
            }
        }
    }

    public static double basicMathExampleWithReturn(String symbol, int a, int b) {
        switch(symbol) {
            case "+": {
                return a + b;
            }
            case "-": {
                return a - b;
            }
                case "*": {
                    return a * b;
                }
                case "/": {
                    return a / b;
                }
        }
        return -1;   //traktowac jako wyjatkowe lub niepowodzenie
    }
}
