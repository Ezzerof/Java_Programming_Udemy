package generics;

public class Printer <T> {
    private T whatToPrint;

    public Printer(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }

    public void print() {
        System.out.println(whatToPrint);
    }
    
    public <T> void print(T somethingElse) {
        System.out.println(somethingElse);
    }

    public <T, V> void print(T somethingElse, V something) {
        System.out.println(somethingElse + " " + something);
    }
}
