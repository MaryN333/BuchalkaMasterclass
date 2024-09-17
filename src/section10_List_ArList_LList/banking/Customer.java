package section10_List_ArList_LList.banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    //Constructor
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions =new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    //Methods
    public void addTransaction(double transactionAmount) {
        transactions.add(transactionAmount);
    }
}