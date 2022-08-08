package point;

public class Point {

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        return Math.sqrt( (getX() - 0.0) * (getX() - 0)  + (getY() - 0) * (getY() - 0));
    }

    public double distance(int x, int y){

        return Math.sqrt( (getX() - x) * (getX() - x)  + (getY() - y ) * (getY() - y));
    }

    public double distance(Point xy){

        return Math.sqrt( (getX() - xy.getX()) * (getX() - xy.getX())  + (getY() - xy.getY() ) * (getY() - xy.getY()));
    }

    public static void main(String[] args) {
        Point p1 = new Point(6,5);
        Point p2 = new Point(3, 1);
        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2,2));

    }
}
