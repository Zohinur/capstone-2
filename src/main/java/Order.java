import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Order {
    public ArrayList<MenuItem> order = new ArrayList<MenuItem>();


    public ArrayList<MenuItem> getOrder() {
        return this.order;
    }

    public void createItem(MenuItem item) {
        order.add(item);
    }

    public void removeItem() {
        order.clear();
    }

    public void displayOrder(ArrayList<MenuItem> item) {
        for (MenuItem m : item) {
            System.out.println(m);
        }
    }

    public double totalPrice() {
        double price = 0;
        for (MenuItem m : order) {
            price += m.getPrice();
        }
        return price;
    }

    public boolean checkSandwich (){
        for (MenuItem m: order){
            if (m instanceof Sandwich){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Here is your receipt from Big Zo's deli: \n ";

        for (MenuItem m : getOrder()) {
            result += m + "\n";
        }
        result += "Total Price: " + totalPrice();
        return result;
    }
}
