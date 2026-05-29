import java.util.ArrayList;

public class Sandwich implements MenuItem {
    private String bread;
    private boolean toastBread;
    private String meats;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;
    private String toppings;
    private ArrayList<Topping> enumToppings;
    private ArrayList<Sauces> enumSauces;
    private ArrayList<Sides> enumSides;
    private String sauces;
    private String sides;
    private int size;

    public Sandwich(){
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

    public void addSauces(Sauces sauces){
        enumSauces.add(sauces);
    }
    public boolean containsSauces(Sauces sauces){
        return enumSauces.contains(sauces);
    }
    public ArrayList<Sauces> getEnumSauces(){
        return enumSauces;
    }
    public void addSides(Sides sides){
        enumSides.add(sides);
    }
    public boolean containsSides(Sides side){
        return enumSides.contains(side);
    }
    public ArrayList<Sides> getEnumSides(){
        return enumSides;
    }



    public Sandwich(String bread, boolean toastBread, String meats, boolean extraMeat, String cheese, boolean extraCheese, String toppings, String sauces, String sides, int size) {
        this.bread = bread;
        this.toastBread = toastBread;
        this.meats = meats;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
        this.sauces = sauces;
        this.sides = sides;
        this.size = size;
    }

//    public int getSize(int userSelection){
//        int size =0;
//        if(userSelection == 4){
//            size = 4;
//        } else if(userSelection == 8){
//            size = 8;
//        } else if( userSelection == 12){
//            size = 12;
//        }
//        return size;
//    }


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

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getSides() {
        return sides;
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

    public void setSides(String sides) {
        this.sides = sides;
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
            return  bread + meats + Cheese + extraMmeat + extraCheesse;

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
            return  bread + meats + Cheese + extraCheesse + extraMmeat;
        }
    return 0;
    }

    public String toString(){
        return ("this is your sandwich"+ getBread() + getMeats() + getPrice());
    }
}
