package sum_3_and_5_challenge;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;

                System.out.printf("Found number: %d\n", i);
                sum +=i;

                if (count == 5){
                    break;
                }
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
