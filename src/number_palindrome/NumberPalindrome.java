package number_palindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        String strNum = Integer.toString(number);
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
        System.out.println(isPalindrome(121));
    }

}
