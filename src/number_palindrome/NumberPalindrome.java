package number_palindrome;

/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
 */

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        String strNum = Integer.toString(Math.abs(number));
        StringBuilder sb = new StringBuilder(strNum);
        sb.reverse();

        int count = 0;
        boolean result = false;

        for (int i = 0; i < sb.length(); i++){
            if (strNum.charAt(i) == sb.charAt(i)){
                count++;
            } else {
                return false;
            }
        }

        if (count == strNum.length())
            result = true;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }

}
