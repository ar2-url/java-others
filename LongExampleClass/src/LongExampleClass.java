public class LongExampleClass {

    //nad metoda main

    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        int lightSpeed = 300_000;
        long numberOfDays = 500;
        long distance;
        long seconds;

                                    //int rezerwuje mniej pamieci a long przechowa wieksza liczbe

        //zmienne
        /*int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;

        seconds = numberOfDays * hoursInDay * minutesInHour * secondsInMinute;*/

        //druga wersja
        seconds = numberOfDays * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
                distance = lightSpeed * seconds;
        System.out.println("W " + numberOfDays + " dni swiatlo przebedzie " + distance + " km");



    }
}
