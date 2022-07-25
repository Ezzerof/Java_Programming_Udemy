package seconds_and_minutes_challenge;

public class secondsAndMinutes {

    public static void getDurationString(int minutes, int seconds){

        int minute = 60;
        int hour = 0;
        int result = 0;

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value.");
        } else {
            if (minutes > 60)
                hour = minutes / minute;
                result = (minutes % minute);
        }
        System.out.printf("%dh:%dm:%ds", hour, result, seconds);
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
        System.out.printf("%dh:%dm:%ds", hours, minutes, remSeconds);
    }

    public static void main(String[] args) {
        getDurationString(140,23);
        System.out.println();
        getDurationString(62);
    }

}
