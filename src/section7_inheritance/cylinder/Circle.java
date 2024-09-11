package section7_inheritance.cylinder;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Method
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
