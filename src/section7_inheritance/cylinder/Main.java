package section7_inheritance.cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());         // circle.radius= 3.75
        System.out.println("circle.area= " + circle.getArea());             // circle.area= 44.178646691106465
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());     // cylinder.radius= 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight());     // cylinder.height= 7.25
        System.out.println("cylinder.area= " + cylinder.getArea());         // cylinder.height= 7.25
        System.out.println("cylinder.volume= " + cylinder.getVolume());     // cylinder.volume= 701.574580913447
    }
}
