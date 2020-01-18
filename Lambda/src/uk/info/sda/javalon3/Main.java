package uk.info.sda.javalon3;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //KLASA ANONIMOWA WEWNETRZNA
        Generator generator = new Generator() {
            @Override
            public int wylosujLiczbeNaturalna(int a) {
                return 5*a;
            }
        };

        System.out.println(generator.wylosujLiczbeNaturalna(5));

        //LAMBDA
        Generator generator1 = (int a) -> {return 5*a;};
        Generator generator2 = a -> 5*a;

        System.out.println(generator2.wylosujLiczbeNaturalna(3));
    }
}
