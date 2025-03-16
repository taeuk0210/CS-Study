package Chapter_13.example.factory;

import Chapter_13.example.Rarity;
import Chapter_13.example.weapons.LegendWeapon;
import Chapter_13.example.weapons.NormalWeapon;
import Chapter_13.example.weapons.RareWeapon;
import Chapter_13.example.weapons.Weapon;

public class WeaponFactory {
    public Weapon createWeapon(Rarity rairity) {
        return switch (rairity) {
            case NORMAL -> new NormalWeapon();
            case RARE -> new RareWeapon();
            case LEGEND -> new LegendWeapon();
        };
    }
}
