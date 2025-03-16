package Chapter_14.example;

import Chapter_14.example.equipments.Armor;
import Chapter_14.example.equipments.Accessory;
import Chapter_14.example.equipments.Purchasable;
import Chapter_14.example.equipments.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Purchasable> equipments;

    public Player() {
        equipments = new ArrayList<>();
    }
    public void equip(Purchasable equipment) {
        this.equipments.add(equipment);
    }
    public int getPrice() {
        return equipments.stream().mapToInt(Purchasable::getPrice).sum();
    }
}
