package vehicle_challenge;

public class Main {

    public static void main(String[] args) {
        Audi a1 = new Audi("Audi", "coupe", "red", 6, 3, 4, "June");

        a1.getCarInfo();
        a1.getGear();
        a1.getSpeed();
        a1.getRoadServiceMonth();
        a1.changingGears(1);
        a1.handSteering("left");
        a1.moving("increase");

    }
}
