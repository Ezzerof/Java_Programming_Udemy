package reverse_array;

import java.util.Arrays;

public class ReversedArray {

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int temp = 0;
        int maxIndex = arr.length -1;
        int mid = (arr.length)/2;
        for (int i = 0; i < mid; i++) {
            temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);

    }
}
