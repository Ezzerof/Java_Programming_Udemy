package mobile_phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOn = true;
        MobilePhone mp = new MobilePhone("0734942");

        System.out.println("Welcome to Contact creator");

        while (isOn) {
            System.out.println("Select what do you want to do: \n1.Add contact\n2.Remove contact\n" +
                    "3.Move contact\n4.Find contact\n5.Exit\n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("\nEnter phone number: ");
                    String pn = scanner.next();
                    mp.addNewContact(new Contact(name, pn));
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter name/number of the contact: ");
                    String input = scanner.next();
                    int position = mp.findContact(input);
                    mp.removeContact(position);
                    break;
                case 3:
                    System.out.print("En");
                case 4:
                    isOn = false;
                    break;
            }


        }

    }

}
