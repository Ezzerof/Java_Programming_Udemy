package polymorphism;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Engine started | Mitsubishi");
    }
    @Override
    public String accelerate() {
        return ("Car is accelerating | Mitsubishi");
    }
    @Override
    public String brake() {
        return ("Car is braking | Mitsubishi");
    }
}
