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
            System.out.println("Invalid value");
        } else {

            System.out.printf("%.1f kh/h = %d mi/h", kilometersPerHour, toMilesPerHour(kilometersPerHour));

        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        printConversion(-5.6);
    }

}
