package banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getBranchName() {
        return name;
    }

    public Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.getName().equals(nameOfBranch)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) == null) {
            this.branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        Branch newBranch = findBranch(nameOfBranch);
        if (newBranch != null) {
            return newBranch.newCustomer(nameOfCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double customerTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, customerTransaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        System.out.println("Customers of " + branchName);
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        if (branch != null) {
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + currentCustomer.getName() + "[" + (i + 1) + "]");
                if (transactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> customerTransactions = currentCustomer.getTransactions();
                    for (int j = 0; j < customerTransactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]" + customerTransactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
