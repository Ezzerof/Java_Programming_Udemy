package interface_challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    private void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name +
                "', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength +
                ", weapon='" + this.weapon +
                "'}";
    }

    @Override
    public List<String> write() {
        List<String> savedPlayers = new ArrayList<String>();
        savedPlayers.add(0, this.name);
        savedPlayers.add(1, String.valueOf(this.hitPoints));
        savedPlayers.add(2, String.valueOf(this.strength));
        savedPlayers.add(3, this.weapon);

        return savedPlayers;
    }

    @Override
    public void read(List<String> list) {
        if (list.size() > 0 && list != null) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
}
