package interest_rate_calculator;

public class InterestRateCalculator {

    public static void calculator(double amount, double interest){
        double rate = amount * (interest/100);
        System.out.printf("For %.2f with an interest of %.2f, you will pay: %.2f",amount, interest, rate);
        System.out.println();
    }

    public static void main(String[] args) {
        double amout = 10000;
        double[] interests = {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};

        for (double i : interests){
            calculator(amout, i);
        }

    }
}
