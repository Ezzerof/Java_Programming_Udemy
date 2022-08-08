package pool_area;

public class Rectangle {

    private double length = 0;
    private double width = 0;

    public Rectangle(double width, double length){
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }
}
