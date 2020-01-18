public class Main {

    public static void main(String[] args) {                         // static - wtedy metoda dziala dla kazdego stolu

        Table table = new Table(100, 500, 600);

        Table table2 = new Table(1000, "Brown");

        Table table3 = new Table("Green", 600);
        /*
        table.introduceYourself();
        table.introduceYourself();
        table.introduceYourself();*/

        Table.introduceYourself();    //poprawne wywalywanie metody
                                        // wywoluje NazwaKlasy.NazwaMetody(); podobnie jak Math.
        Math.pow(2, 6);
        Table.moveToRoomCenter();

        System.out.println(Table.getMaterial());
    }
}
