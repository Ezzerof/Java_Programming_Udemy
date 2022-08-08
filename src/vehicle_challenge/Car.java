package vehicle_challenge;

public class Car extends Vehicle{

    private int gears;
    private int doors;
    private int wheels;
    private int currentGear;

    public Car(String name, String size, String color, int gears, int doors, int wheels) {
        super(name, size, color);
        this.gears = gears;
        this.doors = doors;
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public Car(String name, String size, String color) {
        super(name, size, color);
    }

    public int getGear() {
        return currentGear;
    }

    public void changingGears(int gear){
        if (gear <= 0 || gear > gears){
            this.currentGear = 0;
            System.out.println("Car is in the neutral gear\n");
        } else {
            this.currentGear = gear;
            System.out.printf("Car is in the %d gear\n", getGear());
        }
    }


}
