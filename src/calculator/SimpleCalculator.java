package calculator;

public class SimpleCalculator {

    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double num){
        this.firstNumber = num;
    }

    public void setSecondNumber(double num){
        this.secondNumber = num;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return  firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
