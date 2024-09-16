package section10_List_ArList_LList.bankingApp;

import java.util.ArrayList;

public class Bank {
    private String name;
//    private ArrayList<Customer> customers;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    // Constructor
    public Bank(String name) {
        this.name = name;
//        this.customers = new ArrayList<>(5000);
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer %s not found %n", customerName);
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit){
        if(findCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.println("New customer added: " + newCustomer);
        }
    }

    public void addCustomer(Customer customer) {
        if (findCustomer(customer.getName()) == null) {
            this.customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
    public void addTransaction(Customer customer, double amount) {
        if(findCustomer(customer.getName()) != null){
            customer.getTransactions().add(amount);
        }
    }

    public void addTransaction(String name, double amount) {
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.getTransactions().add(amount);
        }
    }

    public void printCustomer(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("- * ".repeat(25));
        System.out.println(customer.getName());
        System.out.println(customer.getTransactions());
        for(double amount : customer.getTransactions()){
            System.out.printf("$%20.2f (%s) %n", amount, amount < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}