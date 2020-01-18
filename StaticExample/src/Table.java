public class Table {

    private int width;      // jesli tu ustawimy to dla wszystkich bedzie taki wymiar
    private int length;
    private int height;
    private String color;
    private static String material = "drewniany";

    public Table(int width, int length, int height) {
        //color = "Niebieski";
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Table(int width, String color) {
        this.width = width;
        this.color = color;
    }
    public Table(String color, int lenght) {    //jesli zamienimy to zadziala
        this.length = lenght;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void introduceYourself() {
        System.out.println("czesc jestem stolem");
    }

    public static void moveToRoomCenter() {
        System.out.println("Ustawiam na srodku pokoju");
    }

    public static String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

