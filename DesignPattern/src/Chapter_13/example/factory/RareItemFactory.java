package Chapter_13.example.factory;

import Chapter_13.example.armors.Armor;
import Chapter_13.example.armors.RareArmor;
import Chapter_13.example.weapons.RareWeapon;
import Chapter_13.example.weapons.Weapon;

public class RareItemFactory implements ItemFactory {
    @Override
    public Weapon createWeapon() {
        return new RareWeapon();
    }
    @Override
    public Armor createArmor() {
        return new RareArmor();
    }
}
