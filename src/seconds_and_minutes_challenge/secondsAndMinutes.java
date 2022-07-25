package seconds_and_minutes_challenge;

public class secondsAndMinutes {

    public static void getDurationString(int minutes, int seconds){

        int minute = 60;
        int hour = 0;
        int minRest = 0;

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value.");
        } else {
            if (minutes > 60)
                hour = minutes / minute;
                minRest = (minutes % minute);
        }
        String hourString = hour  + "h";
        String minString = minRest + "m";
        String secString = seconds + "s";
        if (hour < 10 || minRest < 10 || seconds < 10){
            if (hour < 10){
                hourString = "0" + hourString;
            }
            if (minRest < 10) {
                minString = "0" + minString;
            }

            if (seconds < 10){
                secString = "0" + secString;
            }
        }
        System.out.printf("%s:%s:%s", hourString, minString, secString);
    }

    public static void getDurationString(int seconds){

        int second = 60;
        int remSeconds = 0;
        int hours = 0;
        int minutes = 0;

        if (seconds < 0) {
            System.out.println("Invalid value.");
        } else {
            minutes = seconds / second;
            remSeconds = seconds % second;
            if (minutes > 60) {
                hours = minutes / 60;
                minutes = minutes % 60;
            }
        }
        String hourString = hours  + "h";
        String minString = minutes + "m";
        String secString = remSeconds + "s";
        if (hours < 10 || minutes < 10 || remSeconds < 10){
            if (hours < 10){
                hourString = "0" + hourString;
            }
            if (minutes < 10) {
                minString = "0" + minString;
            }

            if (remSeconds < 10){
                secString = "0" + secString;
            }
        }
        System.out.printf("%s:%s:%s", hourString, minString, secString);
    }

    public static void main(String[] args) {
        getDurationString(140,23);
        System.out.println();
        getDurationString(62);
    }

}
