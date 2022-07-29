package shared_digits;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second){
        if ((first < 10 || first > 99) || (second < 10 || second > 99)){
            return false;
        }

        boolean result = false;

        String strFirst = Integer.toString(first);
        String strSecond = Integer.toString(second);

        for (int i = 0; i< strFirst.length(); i++){
            char c = strFirst.charAt(i);
            for (int j = 0; j < strSecond.length(); j++){
                if (c == strSecond.charAt(j))
                    result = true;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(42, 55));
    }

}
