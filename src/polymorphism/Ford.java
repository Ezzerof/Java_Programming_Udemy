package polymorphism;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return ("Engine started | Ford");
    }
    @Override
    public String accelerate() {
        return ("Car is accelerating | Ford");
    }
    @Override
    public String brake() {
        return ("Car is braking | Ford");
    }
}
