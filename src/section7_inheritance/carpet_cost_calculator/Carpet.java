package section7_inheritance.carpet_cost_calculator;

public class Carpet {
    // write code here
    private double cost;

    //CONSTRUCTOR
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    // GETTER
    public double getCost() {
        return cost;
    }
}
