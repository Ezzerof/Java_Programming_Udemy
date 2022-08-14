package interface_challenge;

public class Main {
    public static void main(String[] args) {
        ISaveable hz = new Player("Vasaea", 50, 100);
        hz.read(hz.write());
    }
}
