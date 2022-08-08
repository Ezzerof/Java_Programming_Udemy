package compositio_challenge;

public class Main {

    public static void main(String[] args) {

        Dimension mDimension = new Dimension(32); // Monitor dimension in inch
        Dimension tDimension = new Dimension(55); //Tv dimension in inch
        Wifi wifi = new Wifi("5Hz");
        Tv tv = new Tv("Samsung", "black", tDimension, wifi);
        Monitor monitor = new Monitor("Gigabyte", mDimension);
        Computer computer = new Computer(1,1, monitor, wifi);

        Room room = new Room(tv, computer, monitor, wifi);

        room.turnOnEverything();
        System.out.println("Monitor size is: " + computer.getMonitor().getDimension().getSize());
        System.out.println("Wifi power is: " + tv.getwifi().getPower());
    }
}
