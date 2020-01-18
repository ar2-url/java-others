public class Point {

    private int x;
    private int y;

    //jezeli nie jest tworzony zaden konstruktor to wtedy korzysta z konstruktora domyslnego
    // np. public Point() {}

    //konstruktor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;                 //konstruktor wymusza aby ktos podal x i y
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;               // this.x  odwoluje sie do pierwszego int x,   a drugi x to ten x z nawiasu powyzej
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }
}
