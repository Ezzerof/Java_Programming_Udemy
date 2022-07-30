package even_digit_sum;

/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if (number < 0)
            return -1;

        int sum = 0;
        String num = Integer.toString(number);
        int len = Integer.toString(number).length();

        for (int i = 0; i < len; i++){
            char charDigit = num.charAt(i);
            int intDigit = charDigit - '0';

            if (intDigit % 2 == 0){
                sum += intDigit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

}
