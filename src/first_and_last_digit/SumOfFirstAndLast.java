package first_and_last_digit;

import javax.management.MBeanAttributeInfo;

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
