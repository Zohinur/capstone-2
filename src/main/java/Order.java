import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Order {
    public HashSet<MenuItem> order = new HashSet<MenuItem>();
    private String customerName;
    private LocalDate date;
    private LocalTime time;


    public HashSet<MenuItem> getOrder(){
        return order;
    }
    public void createItem(MenuItem item){
        order.add(item);
    }
    public void removeItem(MenuItem item){
        order.remove(item);
    }


}
