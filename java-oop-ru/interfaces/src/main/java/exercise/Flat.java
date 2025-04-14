package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area + balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(area, another.getArea());
    }

    @Override
    public String toString() {
        return String.format("Квартира площадью %.1f метров на %d этаже", area, floor);
    }
}
// END
