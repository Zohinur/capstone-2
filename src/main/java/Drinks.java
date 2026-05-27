public class Drinks implements MenuItem{
    private int size;

    public Drinks(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice(){
        if (getSize() == 1) {
            return 2;
        } else if (getSize() == 2){
            return 2.50;
        } else if( getSize() == 3) {
            return 3.00;
        }
        return 0;
    }
}
 