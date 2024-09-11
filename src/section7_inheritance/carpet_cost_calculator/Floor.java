package section7_inheritance.carpet_cost_calculator;

public class Floor {
    // write code here
    private double width;
    private double length;

    //CONSTRUCTOR
    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    // METHODS
    public double getArea() {
        return width * length;
    }
}
