package decimal_comparator;
/*
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal
places. Otherwise, return false.
 */

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int check1 = (int)(num1 * 1000);
        int check2 = (int)(num2 * 1000);

        return check1 - check2 == 0;

    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(0.0, 0.0));
    }

}
