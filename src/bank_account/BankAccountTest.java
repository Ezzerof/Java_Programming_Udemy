package bank_account;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.setAccountNumber(5412);
        client.setCustomerEmail("JhonW@gmail.com");
        client.setCustomerName("Jhon");
        client.setCustomerPhoneNumber(3123123);
        System.out.println(client.getBalance());
        System.out.println(client.getCustomerName());
        System.out.println(client.getAccountNumber());
        System.out.println(client.getCustomerEmail());
        client.addFunds(251.32);
        System.out.println(client.getBalance());
    }
}
