package section7_inheritance.carpet_cost_calculator;

public class Calculator {
    // write code here
    private Floor floor;
    private Carpet carpet;

    // CONSTRUCTOR
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // METHOD
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
