package Chapter_14.example.equipments;

public class Armor implements Purchasable{
    private int price;
    public Armor(int price) { this.price = price; }
    @Override
    public int getPrice() {
        return price;
    }
}
