package sum_odd;

/*
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.
 */

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean result = false;

        if (number < 0)
            return result;

        if (number % 2 != 0) {
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
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Sum is: " + sumOdd(1,11));
    }

}
