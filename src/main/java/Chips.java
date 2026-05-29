public class Chips implements MenuItem {
    private final double price = 1.50;

    @Override
    public double getPrice() {
        //returning the price for the chips
        return price;
    }

    @Override
    public String toString() {
        return "Ordered 1 chip \uD83C\uDF5F: 1.50";
    }
}
