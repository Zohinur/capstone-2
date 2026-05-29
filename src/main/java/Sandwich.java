import java.util.ArrayList;

public class Sandwich implements MenuItem {
    private String bread;
    private boolean toastBread;
    private String meats;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;
    private String toppings;
    private ArrayList<Topping> enumToppings = new ArrayList<>();
    private ArrayList<Sauces> enumSauces = new ArrayList<>();
    private ArrayList<Sides> enumSides = new ArrayList<>();
    private int size;

    public Sandwich() {
    }

    public void addTopping(Topping topping) {
        enumToppings.add(topping);
    }

    public boolean containsTopping(Topping topping) {
        return enumToppings.contains(topping);
    }

    public ArrayList<Topping> getEnumToppings() {
        return enumToppings;
    }

    public void displayEnumToppings() {
        int i=1;
        for (Topping top : Topping.values()) {
            System.out.println(i++ + " " + top);
        }
    }
    public void displayCustomerEnumToppings(ArrayList<Topping> toppings) {
        for( Topping top: toppings){
            System.out.println(top);
        }
    }
//Sauce section, control system to allow user to add sauces

    public void addSauces(Sauces sauces) {
        enumSauces.add(sauces);
    }

    public boolean containsSauces(Sauces sauces) {
        return enumSauces.contains(sauces);
    }

    public ArrayList<Sauces> getEnumSauces() {
        return enumSauces;
    }

    public void displayEnumSauces(){
        int i=1;
        for(Sauces s: Sauces.values()){
            System.out.println(i++ + " " + s);
        }
    }

    public void displayCustomerEnumSauces(ArrayList<Sauces> sauces){
        for (Sauces s: sauces){
            System.out.println(s);
        }
    }
//Sides
    public void addSides(Sides sides) {
        enumSides.add(sides);
    }

    public boolean containsSides(Sides side) {
        return enumSides.contains(side);
    }

    public ArrayList<Sides> getEnumSides() {
        return enumSides;
    }

    public void displaySides(){
        int i = 1;
        for(Sides s: Sides.values()){
            System.out.println(i++ + " " +s);
        }
    }
    public void displayCustomerSides(ArrayList<Sides> sides){
        int i =1;
        for(Sides s: sides){
            System.out.println(i++ + " " +s);
        }
    }


    public Sandwich(String bread, int size,boolean toastBread, String meats, boolean extraMeat, String cheese, boolean extraCheese, ArrayList<Topping> enumTopping, ArrayList<Sauces> sauces, ArrayList<Sides> sides) {
        this.bread = bread;
        this.toastBread = toastBread;
        this.meats = meats;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.enumToppings = enumTopping;
        this.enumSauces = sauces;
        this.enumSides = sides;
        this.size = size;
    }



    public void setEnumToppings(ArrayList<Topping> enumToppings) {
        this.enumToppings = enumToppings;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isToastBread() {
        return toastBread;
    }

    public void setToastBread(boolean toastBread) {
        this.toastBread = toastBread;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setEnumSides(ArrayList<Sides> enumSides) {
        this.enumSides = enumSides;
    }

    public void setEnumSauces(ArrayList<Sauces> enumSauces) {
        this.enumSauces = enumSauces;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {

        if (getSize() == 4) {
            double bread = 5.50;
            double meats = 1.00;
            double extraMmeat = 0;
            if (extraMeat) {
                extraMmeat = .50;
            }
            double Cheese = 0.75;
            double extraCheesse = 0;
            if (extraCheese) {
                extraCheesse += .30;
            }
            return bread + meats + Cheese + extraMmeat + extraCheesse;

        } else if (getSize() == 8) {
            double bread = 7;
            double meats = 2;
            double extraMmeat = 0;
            if (extraMeat) {
                extraMmeat = 1;
            }
            double Cheese = 1.50;
            double extraCheesse = 0;
            if (extraCheese) {
                extraCheesse = .60;
            }
            return bread + meats + Cheese + extraMmeat + extraCheesse;

        }
        if (getSize() == 12) {
            double bread = 8.50;
            double meats = 3.00;
            double extraMmeat = 0;
            if (extraMeat) {
                extraMmeat += 1.50;
            }
            double Cheese = 2.25;
            double extraCheesse = 0;
            if (extraCheese) {
                extraCheesse += .90;
            }
            return bread + meats + Cheese + extraCheesse + extraMmeat;
        }
        return 0;
    }

    public String toString() {
        return ("Ordered Sandwich: " + getBread() + getMeats() + getPrice()  + getEnumSides() + " ");
    }
}
