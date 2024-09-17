package section10_List_ArList_LList.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    //Constructor
    public Branch(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//        this.name = name;
        this.customers = new ArrayList<>();
    }

    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //Methods
    private Customer findCustomer(String customerName){
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName))
                return customer;
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        Customer newCustomer = findCustomer(customerName);
        if (newCustomer == null){
            newCustomer = new Customer(customerName, initialTransaction);
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double initialTransaction){
        Customer newCustomer = findCustomer(customerName);
        if (newCustomer != null){
            newCustomer.getTransactions().add(initialTransaction);
            return true;
        }
        return false;
    }
}
