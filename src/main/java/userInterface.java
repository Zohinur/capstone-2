import java.util.HashSet;
import java.util.Scanner;

public class userInterface {
    public Order item = new Order();
    Scanner myScanner = new Scanner(System.in);


    public void userinterface() {

    }
    public void init(){
            fileManager.getOrder(item);
    }

    public void display() {
        boolean running = true;
        do {
            System.out.println("""
                    Look at your""");

            String userSelection = myScanner.nextLine();

            switch (userSelection) {
                case "sandwich":
                    makeSandwich();
                    break;
                case "show":
                    getOrder();
                    break;
                case "total":
                    getTotalPrice();
                    break;
                case"Add":
                    init();
                    break;
                case "no":
                    running = false;
            }
        } while (running);


    }


    public void makeSandwich() {
        sandwich sandwich = new sandwich();

        System.out.println("What size would you like?Enter either 4inch, 8inch, or 12inch");
        int sizeInput = Integer.parseInt(myScanner.nextLine());
        sandwich.setSize(sizeInput);

        System.out.println("Select your bread:");
        String userSelection = myScanner.nextLine();
        sandwich.setBread(userSelection);

        System.out.println("would you like your bread toasted? enter yes or no");
        String toastInput = myScanner.nextLine();
        sandwich.setToastBread(toastInput.equalsIgnoreCase("yes"));

        System.out.println("What meat you like on your sandwich?");
        String meatInput = myScanner.nextLine();
        sandwich.setMeats(meatInput);

        System.out.println("Would you also like extra meat on your sandwich? enter yes or no");
        String extraMeat = myScanner.nextLine();
        sandwich.setExtraMeat(extraMeat.equalsIgnoreCase("yes"));

        System.out.println("What type of cheese would you like on your sandwich?");
        String cheeseInput = myScanner.nextLine();
        sandwich.setCheese(cheeseInput);

        System.out.println("Would you like some extra cheese?Enter yes or no");
        String extraCheeseInput = myScanner.nextLine();
        sandwich.setExtraCheese(extraCheeseInput.equalsIgnoreCase("Yes"));

        System.out.println("What toppings would you like? you cannot select the same topping twice");
        String toppingInput = myScanner.nextLine();
        sandwich.setToppings(toppingInput);

        System.out.println("What sauce would you like on your sandwich? ");
        String sauceInput = myScanner.nextLine();
        sandwich.setSauces(sauceInput);

        System.out.println("Would you also like sides? ");
        String sideInput = myScanner.nextLine();
        sandwich.setSides(sideInput);

        System.out.println("Here is your total for this sandwich:");
        System.out.println(sandwich.getPrice());
        item.createItem(sandwich);


    }

    public void addDrink() {
        Drinks newDrink = new Drinks();

        System.out.println("What size drink would you like? Enter small, medium, or large");
        String userSelection = myScanner.nextLine();
        newDrink.setSize(userSelection);

        item.createItem(newDrink);
    }

    public void addChips(){
        Chips newChip = new Chips();

        System.out.println("Adding chips to your order! ");
        item.createItem(newChip);
    }


    public void getOrder() {
        item.displayOrder(item.getOrder());
    }

    public void getTotalPrice(){
        double totalPrice = item.totalPrice();
        System.out.println("Here is your total price of your order: "+ totalPrice);
    }

}
