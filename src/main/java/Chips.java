public class Chips implements MenuItem{
    private final double price = 1.50;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Ordered 1 chip : 1.50";
    }
}
