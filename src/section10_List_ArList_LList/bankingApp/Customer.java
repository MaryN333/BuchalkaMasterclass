package section10_List_ArList_LList.bankingApp;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    // Constructors
    public Customer(String name, double initialDeposit) {
        this.name = name.toUpperCase();
        this.transactions = new ArrayList<>(500);
        transactions.add(initialDeposit);
    }

    public Customer(String name) {
        this(name, 200);
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
