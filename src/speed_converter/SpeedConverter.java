package speed_converter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        double mile = 0.62137;
        long result = 0;

        if (kilometersPerHour < 0) {
            return -1;
        } else {

            result = Math.round(kilometersPerHour * mile);

        }

        return result;

    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.printf("%.2f km/h = %d mi/h", kilometersPerHour, toMilesPerHour(kilometersPerHour));

        }
    }

    public static void main(String[] args) {
        printConversion(1.25);
    }

}
