package minimum_element;

import java.util.Scanner;

public class MinimumElement {

    public int readInteger() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int[] readElements(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp)
                temp = arr[i];
        }
        return temp;
    }


}
