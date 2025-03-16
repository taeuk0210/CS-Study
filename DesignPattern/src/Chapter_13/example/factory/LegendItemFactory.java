package Chapter_13.example.factory;

import Chapter_13.example.armors.Armor;
import Chapter_13.example.armors.LegendArmor;
import Chapter_13.example.weapons.LegendWeapon;
import Chapter_13.example.weapons.Weapon;

public class LegendItemFactory implements ItemFactory {
    @Override
    public Weapon createWeapon() {
        return new LegendWeapon();
    }

    @Override
    public Armor createArmor() {
        return new LegendArmor();
    }
}
