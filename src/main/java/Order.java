import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Order {
    //Creating an arraylist to store objects that are being made
    public ArrayList<MenuItem> order = new ArrayList<MenuItem>();

    //Gets all the items in the order
    public ArrayList<MenuItem> getOrder() {
        return this.order;
    }

    //Creates a object
    public void createItem(MenuItem item) {
        order.add(item);
    }

    //Removes all the objects
    public void removeItem() {
        order.clear();
    }

    //Displays the objects inside the items
    public void displayOrder(ArrayList<MenuItem> item) {
        for (MenuItem m : item) {
            System.out.println(m);
        }
    }

    //Calculates the total price from the order using the method getPrice from the interface
    public double totalPrice() {
        double price = 0;
        for (MenuItem m : order) {
            price += m.getPrice();
        }
        return price;
    }

    //Checks if the Arraylis has a sandwich if not then it returns
    public boolean checkSandwich() {
        for (MenuItem m : order) {
            if (m instanceof Sandwich) {
                return true;
            }
        }
        return false;
    }

    //Checks if there is a chip or a drink in the Arraylist
    public boolean checkChipDrink() {
        for (MenuItem m : order) {
            if (m instanceof Drinks || m instanceof Chips) {
                return true;
            }
        }
        return false;
    }

    //Overriding toString to display the objects in the receipt file.
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
