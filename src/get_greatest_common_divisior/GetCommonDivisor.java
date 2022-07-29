package get_greatest_common_divisior;

public class GetCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10)
            return -1;

        int result = 0;

        for (int i = 10; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }

}
