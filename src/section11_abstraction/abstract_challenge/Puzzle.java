package section11_abstraction.abstract_challenge;

public class Puzzle extends ProductForSale {
    private int pieces;

    public Puzzle(String name, String type, double price, String description, int pieces) {
        super(name, type, price, description);
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public void showDetails() {
        System.out.println("*-".repeat(20));
        System.out.printf(" %-14s %s %n", "Name:", name);
        System.out.printf(" %-14s %s %n", "Pieces:", getPieces());
        System.out.printf(" %-14s %s %n", "Type:", type);
        System.out.printf(" %-14s %.2f %n", "Price:", price);
        System.out.printf(" %-14s %s %n", "Description:", description);
    }
}
