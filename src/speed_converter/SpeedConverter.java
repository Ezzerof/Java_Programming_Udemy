package speed_converter;

/*
Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method
needs to return the rounded value of the calculation of type long.
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding,
check the notes in the text below.
 */

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(1.25);
    }

}
