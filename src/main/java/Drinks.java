public class Drinks implements MenuItem{
    private String size;

    public Drinks(String size) {
        this.size = size;
    }
    public Drinks(){
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice(){
        if (getSize().equalsIgnoreCase("small")) {
            return 2;
        } else if (getSize().equalsIgnoreCase("medium")){
            return 2.50;
        } else if( getSize().equalsIgnoreCase("large")) {
            return 3.00;
        }
        return 0;
    }
}
 