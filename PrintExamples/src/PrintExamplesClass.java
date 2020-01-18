import java.sql.SQLOutput;

public class PrintExamplesClass {
    public static void main(String[] args) {
        //hgvjhgvjhgv

        /*
        to i tamto
         */

        System.out.println("Hello World");

        System.out.printf("Jowita ma %d lizakow\n", 10);
        System.out.printf("Jowita ma %d lizakow i %d cukierkow\n", 10, 100);

        //zmienna typu tekstowego

        String variable = "Hello World";

        System.out.println(variable);
        System.out.println(variable);
        System.out.println(variable);
        System.out.println(variable);

        System.out.println("Ferrari\n");

        int intVariable = 10;
        System.out.println(intVariable);
        System.out.println(intVariable);
        System.out.println(intVariable);

        int mySecondVariable;
        mySecondVariable = 20;

        System.out.println(mySecondVariable);

        //zmienne tylko w jezyku angielskim
        int dogWeight = 90;
        int animalWeight = 44;
        String animalKind2 = "KOT";
        String animalKind = "LIS";

        System.out.printf("Moj " + animalKind2 + " i " + animalKind + " waza %s i %d kg\n", animalWeight, dogWeight);
        System.out.printf("Moj " + animalKind2 + " i " + animalKind+  " waza %s i %d kg\n", animalWeight, dogWeight);
        System.out.printf("Moj " + animalKind2 + " i " + animalKind +  " waza %s i %d kg\n", animalWeight, dogWeight);

        //%s to tekst a %d to liczba, dla double a %f (liczby zmiennoprzecinkowej

        String name = "Ala";
        double height = 162.4;
        int age = 10;
        System.out.printf("%s ma %d lat i %.2f cm wzrostu", name,age, height);
        //System.out.printf("Ala ma" + alaAge + "lat i " + height + " cm wzrostu");
        //float var =
    }
}
