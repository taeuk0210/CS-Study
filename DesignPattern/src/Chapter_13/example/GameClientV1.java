package Chapter_13.example;

import Chapter_13.example.factory.ArmorFactory;
import Chapter_13.example.factory.WeaponFactory;

import java.util.Arrays;

public class GameClientV1 {
    public static void main(String[] args) {
        Item[] items = {
                createItem(Rarity.NORMAL),
                createItem(Rarity.RARE),
                createItem(Rarity.LEGEND),
        };

        Arrays.stream(items).forEach(i -> {
            i.getWeapon().attack();
            i.getArmor().defend();
            System.out.println();
        });
    }

    public static Item createItem(Rarity rarity) {
        WeaponFactory weaponFactory = new WeaponFactory();
        ArmorFactory armorFactory = new ArmorFactory();

        return new Item(
                weaponFactory.createWeapon(rarity),
                armorFactory.createArmor(rarity)
        );
    }
}
