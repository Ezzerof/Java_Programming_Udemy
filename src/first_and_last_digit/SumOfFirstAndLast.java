package first_and_last_digit;

/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and
return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class SumOfFirstAndLast {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;

        int sum = 0;

        String num = Integer.toString(number);
        int len = Integer.toString(number).length();

        if (len == 1){
            sum = number * 2;
        }

        char first = num.charAt(0);
        char last = num.charAt(len-1);

        return sum = (first - '0')+(last - '0');

    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));

    }
}
