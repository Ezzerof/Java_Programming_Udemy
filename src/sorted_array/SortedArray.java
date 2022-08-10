package sorted_array;

import java.util.Scanner;

public class SortedArray {

    public static int[] arrayCreator() {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        if (input.hasNextInt())
            n = input.nextInt();
        else
            System.out.println("Invalid input.");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.print("Please enter numbers: ");
            if (input.hasNextInt())
                arr[i] = input.nextInt();
            else
                System.out.println("Invalid input.");
        }
        return arr;
    }

    public static int[] arraySorter(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void getArrayValue(int[] arr) {

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = arrayCreator();

        System.out.println("Your initial array is: ");

        getArrayValue(arr);

        arraySorter(arr);

        System.out.println("Your sorted array (decreased values) is: ");
        getArrayValue(arr);

    }
}
