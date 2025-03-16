package Chapter_13.example.armors;

public class NormalArmor implements Armor {
    @Override
    public void defend() {
        System.out.println("\uD83D\uDEE1\uFE0F 보통 방어구로 방어!");
    }
}