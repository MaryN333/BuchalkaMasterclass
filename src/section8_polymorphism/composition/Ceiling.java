package section8_polymorphism.composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    //Constructor
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
    //Getters
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
