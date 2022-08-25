package generics;

public class Main {
    public static void main(String[] args) {
        Printer<?> printer = new Printer<>(2);
        printer.print();

        Printer<String> printer2 = new Printer<>("Hello");
        printer2.print();

        printer2.print("Java");
        printer2.print(100);
        printer2.print(42, "Generics");
    }
}
