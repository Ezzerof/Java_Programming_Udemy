package compositio_challenge;

public class Room {

    private Tv tv;
    private Computer computer;
    private Monitor monitor;
    private Wifi wifi;

    public Room(Tv tv, Computer computer, Monitor monitor, Wifi wifi) {
        this.tv = tv;
        this.computer = computer;
        this.monitor = monitor;
        this.wifi = wifi;
    }

    public void turnOnEverything(){
        tv.isOn();
        computer.turningOnComputer();
    }

    public Tv getTv() {
        return tv;
    }

    public Computer getComputer() {
        return computer;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Wifi getWifi() {
        return wifi;
    }
}
