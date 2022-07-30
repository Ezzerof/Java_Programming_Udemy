package equal_sum_checker;

/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to
the third parameter. Otherwise, return false.
 */

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c){

        boolean result = false;
        int sum = a + b;

        if (sum == c)
            result = true;
        else
            result = false;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

}
