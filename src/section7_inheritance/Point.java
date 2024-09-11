package section7_inheritance;

public class Point {
    // write code here
    private int x;
    private int y;

    // CONSTRUCTORS
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTERS AND SETTERS
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // METHODS
    public double distance() {
//        return Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
