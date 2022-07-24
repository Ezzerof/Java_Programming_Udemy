package equal_sum_checker;

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
