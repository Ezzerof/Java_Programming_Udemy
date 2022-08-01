package flour_pack_problem;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (smallCount < 0 || bigCount < 0 || goal < 0)
            return false;

        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }

        return smallCount >= goal;
    }

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
}
