package interface_challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{='" + this.name +
                "', hitPoints=" + this.hitPoints +
                ", strenght=" + this.strength;
    }

    @Override
    public List<String> write() {
        List<String> savedMonsters = new ArrayList<>();
        savedMonsters.add(0, this.name);
        savedMonsters.add(1, String.valueOf(this.hitPoints));
        savedMonsters.add(2, String.valueOf(this.strength));

        return savedMonsters;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }
}
