package bank_account;

public class Main {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.setAccountNumber(5412);
        client.setCustomerEmail("JhonW@gmail.com");
        client.setCustomerName("Jhon");
        client.setCustomerPhoneNumber(3123123);
        System.out.println("Client " + client.getCustomerName() + " with account number " + client.getAccountNumber() + " balance is: " + client.getBalance());
        System.out.println(client.getCustomerEmail());
        client.addFunds(251.32);
        System.out.println("Client " + client.getCustomerName() + " with account number " + client.getAccountNumber() + " balance is: " + client.getBalance());

    }
}
