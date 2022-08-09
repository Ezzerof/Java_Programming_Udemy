package polymorphism;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return ("Engine started | Holden");
    }
    @Override
    public String accelerate() {
        return ("Car is accelerating | Holden");
    }
    @Override
    public String brake() {
        return ("Car is braking | Holden");
    }
}
