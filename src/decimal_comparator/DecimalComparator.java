package decimal_comparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        boolean result = false;
        String x = String.valueOf(a);
        String y = String.valueOf(b);

        if (x.equals(y))
            result = true;
        else
            result = false;

        return result;

    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.1756));
    }

}
