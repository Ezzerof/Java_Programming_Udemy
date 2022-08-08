package compositio_challenge;

public class Wifi {

    private String power;

    public Wifi(String power){
        this.power = power;
    }

    public void turningOnWifi(){
        System.out.println("Wifi is turning on");
    }

    public String getPower() {
        return power;
    }
}
