package Chapter_13.example.factory;

import Chapter_13.example.armors.Armor;
import Chapter_13.example.weapons.Weapon;

public interface ItemFactory {
   Weapon createWeapon();
   Armor createArmor();
}
