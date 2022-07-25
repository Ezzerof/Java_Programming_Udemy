package minutes_to_year_and_days_calculator;

public class MinToYearAndDays {

    public static void printYearAndDays(long minutes){

        if (minutes < 0)
            System.out.println("Invalid value");

        long hr = 60;
        long day = 24;
        long year = 365;

        long newDays = 0;
        long newYears = 0;

        long newHrs = minutes/hr;
        if (newHrs > 24){
            newDays = newHrs/day;
        }
        if (newDays >= year){
            long restDays = newDays % year;
            newYears = newDays/year;
            System.out.printf("%d min = %d y and %d d", minutes, newYears, restDays);
        } else {
            newYears = newDays/year;
            System.out.printf("%d min = %d y and %d d", minutes, newYears, newDays);
        }


    }

    public static void main(String[] args) {

        printYearAndDays(561600);
    }
}
