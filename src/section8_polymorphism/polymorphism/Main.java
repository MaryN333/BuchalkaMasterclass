package section8_polymorphism.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());              // Car -> startEngine()
        System.out.println(car.accelerate());               // Car -> accelerate()
        System.out.println(car.brake());                    // Car -> brake()

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());       // Mitsubishi -> startEngine()
        System.out.println(mitsubishi.accelerate());        // Mitsubishi -> accelerate()
        System.out.println(mitsubishi.brake());             // Mitsubishi -> brake()

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());             // Ford -> startEngine()
        System.out.println(ford.accelerate());              // Ford -> accelerate()
        System.out.println(ford.brake());                   // Ford -> brake()

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());           // Holden -> startEngine()
        System.out.println(holden.accelerate());            // Holden -> accelerate()
        System.out.println(holden.brake());                 // Holden -> brake()
    }
}