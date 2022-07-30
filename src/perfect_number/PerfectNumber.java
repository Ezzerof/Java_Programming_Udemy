package perfect_number;

import java.util.ArrayList;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if (number < 1)
            return false;

        boolean result = false;
        int sum =0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
            if (sum == number)
                result = true;

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }

}
