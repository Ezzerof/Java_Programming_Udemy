package calc_feet_and_inches_tocm;

public class calcFeetAnddInchesToCentimeters {

    public static double calculator(double feet, double inches){

        double result = 0;

        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        } else {
            result = (feet * 12) * 2.54;
            result += inches * 2.54;
        }

        return result;

    }
    public static double calculator(double inches){

        double ft = 12;
        double result = 0;

        if (inches < 0){
            return -1;
        } else {
            result = inches * ft;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(calculator(1,2));
    }
}
