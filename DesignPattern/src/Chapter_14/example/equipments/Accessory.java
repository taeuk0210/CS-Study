package Chapter_14.example.equipments;

public class Accessory implements Purchasable{
    private int price;
    public Accessory(int price) { this.price = price; }
    @Override
    public int getPrice() {
        return price;
    }
}
