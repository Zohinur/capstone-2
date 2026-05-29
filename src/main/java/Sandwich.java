import java.util.ArrayList;

public class Sandwich implements MenuItem {
    private String bread;
    private boolean toastBread;
    private String meats;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;
    private ArrayList<Topping> enumToppings = new ArrayList<>();
    private ArrayList<Sauces> enumSauces = new ArrayList<>();
    private ArrayList<Sides> enumSides = new ArrayList<>();
    private int size;

    //Created this empty constructor to use methods from this class
    public Sandwich() {
    }

    //Created this constructor to store new sandwich objects
    public Sandwich(String bread, int size, boolean toastBread, String meats, boolean extraMeat, String cheese, boolean extraCheese, ArrayList<Topping> enumTopping, ArrayList<Sauces> sauces, ArrayList<Sides> sides) {
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

    //enumToppings to control the topping
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
        int i = 1;
        for (Topping top : Topping.values()) {
            System.out.println(i++ + " " + top);
        }
    }

    public void displayCustomerEnumToppings(ArrayList<Topping> toppings) {
        for (Topping top : toppings) {
            System.out.println(top);
        }
    }
//Sauce section, control system to allow user to add sauces

    public void addSauces(Sauces sauces) {
        //Adds the sauce to the arraylist
        enumSauces.add(sauces);
    }

    public boolean containsSauces(Sauces sauces) {
        return enumSauces.contains(sauces);
    }

    public ArrayList<Sauces> getEnumSauces() {
        return enumSauces;
    }

    public void displayEnumSauces() {
        int i = 1;
        for (Sauces s : Sauces.values()) {
            System.out.println(i++ + " " + s);
        }
    }

    public void displayCustomerEnumSauces(ArrayList<Sauces> sauces) {
        for (Sauces s : sauces) {
            System.out.println(s);
        }
    }

    //Enum for the sides
    public void addSides(Sides sides) {
        enumSides.add(sides);
    }

    public boolean containsSides(Sides side) {
        return enumSides.contains(side);
    }

    public ArrayList<Sides> getEnumSides() {
        return enumSides;
    }

    public void displaySides() {
        int i = 1;
        for (Sides s : Sides.values()) {
            System.out.println(i++ + " " + s);
        }
    }

    public void displayCustomerSides(ArrayList<Sides> sides) {
        int i = 1;
        for (Sides s : sides) {
            System.out.println(i++ + " " + s);
        }
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

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
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


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
//Using size to get price and adding all the ingredients to find the final price
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
            //Adding all the items nesscary to get the final price and returning it
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
        //the default
        return 0;
    }

    @Override
    public String toString() {
        //Overriding toString to build my own to display the object
        return ("Ordered Sandwich\uD83E\uDD6A " + "Bread:" + getBread() + " Toasted:" + isToastBread() + " meat:" + getMeats() + " Extra Meat?:" + isExtraMeat() + " Cheese:" + getCheese() + " ExtraCheese:" + isExtraCheese() + " \nToppings:" + getEnumToppings() + " Sauces:" + getEnumSauces() + " Sides:" + getEnumSides());
    }
}
