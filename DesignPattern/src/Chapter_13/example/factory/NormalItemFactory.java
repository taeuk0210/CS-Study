package Chapter_13.example.factory;

import Chapter_13.example.armors.Armor;
import Chapter_13.example.armors.NormalArmor;
import Chapter_13.example.weapons.NormalWeapon;
import Chapter_13.example.weapons.Weapon;

public class NormalItemFactory implements ItemFactory {
    @Override
    public Weapon createWeapon() { return new NormalWeapon(); }
    @Override
    public Armor createArmor() { return new NormalArmor(); }
}
