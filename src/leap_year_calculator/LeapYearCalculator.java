package leap_year_calculator;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year){

        boolean result = false;

        if (year<0) {
            result = false;
        } else {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0){
                        result = true;
                    } else {
                        result = false;
                    }
                } else {
                    result = true;
                }
            } else {
                result = false;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

}
