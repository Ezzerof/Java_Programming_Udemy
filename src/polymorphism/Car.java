package polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return ("Engine started | Car");
    }

    public String accelerate() {
        return ("Car is accelerating | Car");
    }

    public String brake() {
        return ("Car is braking | Car");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
