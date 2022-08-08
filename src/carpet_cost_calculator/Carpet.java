package carpet_cost_calculator;

public class Carpet {

    private double cost;

    public Carpet(double cost){
        if (cost < 0)
            this.cost = 0;
        else
            this.cost = cost;
    }

    public double getCost(){
        return cost;
    }

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
    }

}
