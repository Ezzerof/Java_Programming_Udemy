package vehicle_challenge;

public class Audi extends Car{

    private String roadServiceMonth;

    public Audi(String name, String size, String color, int gears, int doors, int wheels, String roadServiceMonth) {
        super(name, size, color, gears, doors, wheels);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void getCarInfo() {
        System.out.println("Car name: " + super.getName() + "\nCar size: " + super.getSize() + "\nCar color: " + super.getColor() +
                "\nCar has: " + super.getGears() + " gears\nCar has: " + super.getDoors() + " doors\nCar has: " + super.getWheels() +
                " wheels");
    }

    public void getRoadServiceMonth() {
        System.out.println("Road service ends on: " + roadServiceMonth);
    }
}
