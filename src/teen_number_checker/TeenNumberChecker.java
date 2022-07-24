package teen_number_checker;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){

        boolean result = false;

        if (a >= 13 && a <=19 || b >= 13 && b <=19 || c >= 13 && c <=19)
            result = true;
        else
            result = false;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(23,22,34));
    }

}
