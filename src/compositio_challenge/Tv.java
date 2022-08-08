package compositio_challenge;

public class Tv {

    private String manufacturer;
    private String color;
    private Dimension dimension;
    private Wifi wifi;

    public Tv(String manufacturer, String color, Dimension dimension, Wifi wifi){
        this.manufacturer = manufacturer;
        this.color = color;
        this.dimension = dimension;
        this.wifi = wifi;
    }

    public void isOn(){
        System.out.println("Tv is on.\n");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Wifi getwifi(){
        return wifi;
    }
}
