package playing_cat;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean result = false;

        if (summer) {

            if (temperature >= 25 && temperature <= 45)
                result = true;

        } else {

            if (temperature >= 25 && temperature <= 35)
                result = true;

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 36));
    }

}
