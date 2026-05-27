import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Order {
    public HashSet<MenuItem> order = new HashSet<MenuItem>();
    private String customerName;
    private LocalDate date;
    private LocalTime time;


    public HashSet<MenuItem> getOrder(){
return this.order;
    }
    public void createItem(MenuItem item){
        order.add(item);
    }
    public void removeItem(MenuItem item){
        order.remove(item);
    }
    public void displayOrder(HashSet<MenuItem> item){
        for ( MenuItem m : item){
            System.out.println(m);
        }
    }

    public double totalPrice(){
        double price =0;
        for(MenuItem m: order){
            price += m.getPrice();
        }
        return price;
    }


}
