package sum_odd;

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean result = false;

        if (number < 0)
            return result;

        if (number % 2 == 0) {
            result = true;
            System.out.printf("%d is odd\n", number);
        } else {
            return result;
        }

        return result;
    }

    public static int sumOdd(int start, int end){

        if (start < 0 || end < start)
            return -1;

        int sum = 0;
        for (int i = start; i < end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: " + sumOdd(1,100));
    }

}
