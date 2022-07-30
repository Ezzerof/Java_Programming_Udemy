package perfect_number;

/*
Therefore, 6 is a perfect number (as well as the first perfect number).
Write a method named isPerfectNumber with one parameter of type int named number.
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise,
it should return false.
 */

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if (number < 1)
            return false;

        boolean result = false;
        int sum = 0;

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
