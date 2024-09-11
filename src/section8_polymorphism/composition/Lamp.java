package section8_polymorphism.composition;

public class Lamp {
    // write code here
    private String style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //Getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    //Methods
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
}
