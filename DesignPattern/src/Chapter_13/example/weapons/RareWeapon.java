package Chapter_13.example.weapons;

public class RareWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("⚔\uFE0F 레어 무기로 공격!");
    }
}
