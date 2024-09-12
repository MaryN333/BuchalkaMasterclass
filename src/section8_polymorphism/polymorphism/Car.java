package section8_polymorphism.polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    //Methods
    public String startEngine() {
        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
//        return getClass().getName() + " -> brake()";
        return this.getClass().getSimpleName() + " -> brake()";
    }
}
