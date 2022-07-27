package even_digit_sum;

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
