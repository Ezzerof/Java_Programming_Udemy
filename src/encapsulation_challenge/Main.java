package encapsulation_challenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(200);
        System.out.println("Toner is: " + printer.getToner());
        System.out.println("Pages printed: " + printer.getPagePrinted());
        printer.pagesToPrint(20, "duplex");
        System.out.println("Toner is: " + printer.getToner());
        System.out.println("Pages printed: " + printer.getPagePrinted());
        System.out.println("");
        printer.pagesToPrint(13, "duplex");
        System.out.println("Toner is: " + printer.getToner());
        System.out.println("Pages printed: " + printer.getPagePrinted());
        System.out.println();

        printer.fillingToner(50);
        System.out.println("Toner is: " + printer.getToner());

    }
}
