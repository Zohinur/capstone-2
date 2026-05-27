import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Order {
    public HashSet<MenuItem> order = new HashSet<MenuItem>();
    private String customerName;
    private LocalDate date = LocalDate.now();
    private LocalTime time = LocalTime.now();

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

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

        @Override
    public String toString(){
        return "Date: " + getDate() +
                ", Time: " + getTime() +
                ", Name: " + getCustomerName();
        }
}
