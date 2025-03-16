package Chapter_13.example.weapons;

public class LegendWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("⚔\uFE0F 전설 무기로 공격!");
    }
}
