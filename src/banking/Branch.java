package banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String Name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(Name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}
