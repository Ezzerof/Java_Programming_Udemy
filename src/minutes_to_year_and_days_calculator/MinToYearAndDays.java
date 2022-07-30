package minutes_to_year_and_days_calculator;

/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
 */

public class MinToYearAndDays {

    public static void printYearAndDays(long minutes){

        if (minutes < 0)
            System.out.println("Invalid Value");

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
