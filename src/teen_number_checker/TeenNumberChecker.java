package teen_number_checker;

/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) -
19 (inclusive). Otherwise return false.
 */

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
