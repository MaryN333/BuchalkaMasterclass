package section10_List_ArList_LList.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();

    }

    //Methods
    private Branch findBranch(String branchName){
        for(Branch branch : branches){
//            if(branch.getName() == branchName){
            if(branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
//            branch = new Branch(branchName);
//            branch.newCustomer(customerName, initialTransaction);
//            branches.add(branch);
//            return true;
            return false;
        } else {
            for (Customer c : branch.getCustomers()) {
                if (c.getName() == customerName) {
                    return false;
                }
            }

            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        for (Customer c : branch.getCustomers()) {
            if (c.getName() == customerName) {
                c.addTransaction(transactionAmount);
                return true;
            }
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        if(printTransactions){
            System.out.println("Customer details for branch " + branch.getName());
            int customerCount = 1;
            for (Customer c : branch.getCustomers()) {
                System.out.println("Customer: " + c.getName() + "[" + customerCount + "]");
                System.out.println("Transactions");
                customerCount++;
                int transactionCount = 1;
                for (double transaction : c.getTransactions()){
                    System.out.println("[" + transactionCount + "] " + "Amount "+ transaction);
                    transactionCount++;
                }
            }
        } else {
            System.out.println("Customer details for branch " + branch.getName());
            int customerCount = 1;
            for (Customer c : branch.getCustomers()) {
                System.out.println("Customer: " + c.getName() + "[" + customerCount + "]");
                customerCount++;
            }
        }
        return true;
    }
}
