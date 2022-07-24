package positive_negative_zero;

public class PositiveNegativeZero {

    static void checkNumber(int number){
        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(-1);
    }


}
