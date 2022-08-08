package compositio_challenge;

public class Computer {

    private int mouse;
    private int keyboard;
    private Monitor monitor;
    private Wifi wifi;

    public Computer(int mouse, int keyboard, Monitor monitor, Wifi wifi) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.wifi = wifi;
    }

    public void turningOnComputer(){
        System.out.println("Computer is turning on\n");
        getMonitor().turningOnMonitor();
        getWifi().turningOnWifi();
    }

    public int getMouse() {
        return mouse;
    }

    public int getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Wifi getWifi() {
        return wifi;
    }
}
