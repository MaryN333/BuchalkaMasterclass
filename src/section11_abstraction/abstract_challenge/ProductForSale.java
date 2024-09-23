package section11_abstraction.abstract_challenge;

public abstract class ProductForSale {
    protected String name;
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String name, String type, double price, String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printPricedItem(int quantity){
        System.out.printf(" %-14s %d %n", "Quantity", quantity);
        System.out.printf(" %-14s %.2f %n", "Total Price", getSalesPrice(quantity));
    }

    public abstract void showDetails();
}
