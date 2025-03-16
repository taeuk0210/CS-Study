package Chapter_14.example;

import Chapter_14.example.equipments.Accessory;
import Chapter_14.example.equipments.Armor;
import Chapter_14.example.equipments.Weapon;

public class GameClient {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(500);
        Armor armor = new Armor(500);
        Accessory accessory = new Accessory(500);

        Player player = new Player();
        player.equip(weapon);
        player.equip(armor);
        player.equip(accessory);

        System.out.println(player.getPrice());
    }
}
