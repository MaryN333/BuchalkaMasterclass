package section7_inheritance.pool_area;

public class Rectangle {
    private double width;
    private double length;

    //Constructor
    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    // Method
    public double getArea() {
        return width * length;
    }
}
