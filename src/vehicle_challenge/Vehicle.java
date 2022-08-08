package vehicle_challenge;

public class Vehicle {

    private String name;
    private String size;
    private String color;
    private String direction;
    private int speed;

    public Vehicle(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed(){
        return speed;
    }

    public String getDirection() {
        return direction;
    }

    public void handSteering(String direction){
        if (direction != "left" || direction != "right" || direction != "forward" || direction != "backward"){
            this.direction = "forward";
        } else {
            this.direction = direction;
        }
        System.out.println("Car is going " + getDirection() + "\n");
    }

    public void moving(String speed){
        if (speed == "increase"){
            this.speed += 5;
            System.out.println("The speed is increasing, speed is: " + getSpeed() + "\n");
        }
        else {
            this.speed -= 5;
            System.out.println("The speed is decreasing, speed is: " + getSpeed() + "\n");
        }
    }

    public void stop(){
        speed = 0;
    }
}
