package Chapter_13.example;

import Chapter_13.example.factory.*;

import java.util.Arrays;

public class GameClientV2 {
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
        ItemFactory itemFactory = switch (rarity) {
            case RARE -> new RareItemFactory();
            case LEGEND -> new LegendItemFactory();
            default -> new NormalItemFactory();
        };
        return new Item(
                itemFactory.createWeapon(),
                itemFactory.createArmor()
        );
    }
}
