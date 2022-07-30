package last_digit_checker;

/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the
range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
 */

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)){
            return false;
        }
        boolean result = false;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String strC = Integer.toString(c);

        char c1 = strA.charAt(strA.length() - 1);
        char c2 = strB.charAt(strB.length() - 1);
        char c3 = strC.charAt(strC.length() - 1);

        for (int i = 0; i < 3; i++) {
            if (c1 == c2 || c1 == c3 || c2 == c3)
                result = true;
        }

        return result;
    }

    public static boolean isValid(int num){
        return (num>=10 && num<=1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(42, 76, 56));
    }
}
