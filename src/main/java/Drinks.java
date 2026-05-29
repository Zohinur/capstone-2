public class Drinks implements MenuItem {
    private String size;

    public Drinks(String size) {
        this.size = size;
    }

    public Drinks() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        //Getting the price based on the size
        if (getSize().equalsIgnoreCase("small")) {
            //getting the size then returning the price based off the size
            return 2;
        } else if (getSize().equalsIgnoreCase("medium")) {
            return 2.50;
        } else if (getSize().equalsIgnoreCase("large")) {
            return 3.00;
        }
        return 0;
    }

    @Override
    public String toString() {

        return "Added a " + getSize() + " Drink \uD83E\uDD6A price: " + getPrice();
    }
}
 