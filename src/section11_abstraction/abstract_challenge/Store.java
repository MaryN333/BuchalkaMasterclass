package section11_abstraction.abstract_challenge;

import java.util.ArrayList;

record OrderItem (int qty, ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> products = new ArrayList<>();
//    private static ArrayList<OrderItem> order1 = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Pen("pen", "stationery", 2.15, "Comfortable writing pen", "blue"));
        products.add(new Pen("pen", "stationery", 2.15, "Comfortable writing pen", "green"));

        products.add(new Puzzle("Puzzle Tiger eyes", "board game", 20.55, "This puzzle features a majestic tiger prowling through a vibrant, lush jungle, providing a perfect blend of beauty and challenge for jigsaw puzzle enthusiasts of all ages", 1000));

        var order1 = new ArrayList<OrderItem>();
//        ArrayList<OrderItem> order1 = new ArrayList<>();

        addItemToOrder(order1,1,5);
        addItemToOrder(order1,2,1);

        listProducts();
        // OR
//        listProducts(products);

        System.out.println("Order # 1");
        printOrder(order1);

    }

    public static void listProducts(){
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
    // OR
    public static void listProducts(ArrayList<ProductForSale> products){
        for(ProductForSale product : products){
            product.showDetails();
        }
    }


    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double totalPrice = 0;
        for(OrderItem orderItem : order){
            orderItem.product().showDetails();
            orderItem.product().printPricedItem(orderItem.qty());
            totalPrice += orderItem.product().getSalesPrice(orderItem.qty());
        }
        System.out.println("*-".repeat(20));
        System.out.println("*-".repeat(20));
        System.out.printf("SALES TOTAL = %.2f%n", totalPrice);
    }

}
