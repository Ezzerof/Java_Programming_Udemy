package pool_area;

public class Cuboid extends Rectangle {

    private double height = 0;

    public Cuboid(double width, double length, double height) {
        super(length, width);

        if (height > 0)
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
