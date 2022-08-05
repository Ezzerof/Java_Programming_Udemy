package bank_account;

public class BankAccount {

    private int accountNumber;
    private double balance = 0;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public void setCustomerEmail(String email){
        this.customerEmail = email;
    }

    public void setCustomerPhoneNumber(int pNumber){
        this.customerPhoneNumber = pNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public int getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void addFunds(double funds){
        balance += funds;
        System.out.println("Successful added: " + funds);
    }

    public void withdraw(double funds){
        if (funds < balance){
            balance -= funds;
        } else {
            System.out.println("No sufficient funds");
        }
    }
}
