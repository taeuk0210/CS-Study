package Chapter_13.example;

import Chapter_13.example.armors.Armor;
import Chapter_13.example.weapons.Weapon;

public class Item {
    private Weapon weapon;
    private Armor armor;

    public Item(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
