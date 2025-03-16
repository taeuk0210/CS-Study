package Chapter_13.example.weapons;

public class NormalWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("⚔\uFE0F 보통 무기로 공격!");
    }
}