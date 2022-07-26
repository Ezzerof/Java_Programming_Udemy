package number_of_days_in_month;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        boolean result = false;

        if (year < 1 || year >9999)
            return result;

        if (year % 400 == 0){
            result = true;
        } else if (year % 4 == 0) {

            if (year % 100 != 0)
                result = true;
            else
                result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

}
