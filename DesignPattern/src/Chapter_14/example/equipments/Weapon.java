package Chapter_14.example.equipments;

public class Weapon implements Purchasable{
    private int price;
    public Weapon(int price) { this.price = price; }
    @Override
    public int getPrice() {
        return price;
    }
}
