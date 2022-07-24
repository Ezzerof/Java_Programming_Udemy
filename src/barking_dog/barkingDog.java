package barking_dog;

public class barkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean result = false;

        if (hourOfDay > 23 || hourOfDay < 0) {
            result = false;
        } else {
            if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,2));
    }

}
