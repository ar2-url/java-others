public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {    // przeciázanie metod gdy korzysta juz z wczesniej podanej metody
        return a + b + c;


    }

    /*public static int add(int[] array) {
        int sumResult = 0;
        for(int i = 0; i < array.length; i++) {
             sumResult = sumResult + array[i];
        }
        return sumResult;*/


    public static int add(int... variables) {   //int.. (i trzy kropki to wlasnie dla VarArgs
        int sumResult = 0;
        for(int i =0; i < variables.length; i++) {
            sumResult = sumResult + variables[i];
        }
        return sumResult;                         //przy tym zapisie idzie do results = calculator.add(cyfry)
    }
}
