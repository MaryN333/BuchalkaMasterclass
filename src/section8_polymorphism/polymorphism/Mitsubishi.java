package section8_polymorphism.polymorphism;

public class Mitsubishi extends Car{
    // Constructor
    public Mitsubishi(int cylinders,String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}