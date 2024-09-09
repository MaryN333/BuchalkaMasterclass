package section7_inheritance;

public class Wall {
    private double width;
    private double height;

    // Constructors
    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    // Methods
    public double getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());          // area= 20.0
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());        // width= 5.0
        System.out.println("height= " + wall.getHeight());      // height= 0.0
        System.out.println("area= " + wall.getArea());          // area= 0.0
    }
}