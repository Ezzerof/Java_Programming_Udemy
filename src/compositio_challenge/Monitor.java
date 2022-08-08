package compositio_challenge;

public class Monitor {

    private String model;
    private Dimension dimension;

    public Monitor(String model, Dimension dimension) {
        this.model = model;
        this.dimension = dimension;

    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void turningOnMonitor(){
        System.out.println("Monitor is turning on\n");
    }
}
