package input_calculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                avg = (double)sum / (double)count;
                System.out.printf("SUM = %d AVG = %d", sum, Math.round(avg));
                break;
            }

            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
