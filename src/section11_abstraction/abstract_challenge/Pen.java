package section11_abstraction.abstract_challenge;

public class Pen extends ProductForSale {

    private String color;

    public Pen(String name, String type, double price, String description, String color) {
        super(name, type, price, description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        System.out.println("*-".repeat(20));
        System.out.printf(" %-14s %s %n", "Name:", name);
        System.out.printf(" %-14s %s %n", "Color:", getColor());
        System.out.printf(" %-14s %s %n", "Type:", type);
        System.out.printf(" %-14s %.2f %n", "Price:", price);
        System.out.printf(" %-14s %s %n", "Description:", description);
    }
}
