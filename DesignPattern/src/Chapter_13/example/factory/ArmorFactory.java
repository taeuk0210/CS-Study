package Chapter_13.example.factory;

import Chapter_13.example.Rarity;
import Chapter_13.example.armors.LegendArmor;
import Chapter_13.example.armors.NormalArmor;
import Chapter_13.example.armors.RareArmor;
import Chapter_13.example.armors.Armor;

public class ArmorFactory {
    public Armor createArmor(Rarity rairity) {
        return switch (rairity) {
            case NORMAL -> new NormalArmor();
            case RARE -> new RareArmor();
            case LEGEND -> new LegendArmor();
        };
    }
}
