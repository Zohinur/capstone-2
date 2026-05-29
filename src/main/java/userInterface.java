import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
    public Order item = new Order();
    Scanner myScanner = new Scanner(System.in);

    public void userinterface() {
    }

    public void init() {
        fileManager.saveOrder(item);
    }

    public void display() {
        boolean running = true;
        do {
            System.out.println("""
                    Welcome to the Deli!!!
                    What would you like to order?
                    1. Make a Sandwich
                    2. Add Drink
                    3. Add chips
                    4. checkout""");
            String userSelection = myScanner.nextLine();

            switch (userSelection) {
                case "1":
                    makeSandwich();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    getTotalPrice();
                    getOrder();
                    break;
                case "5":
                    displayRegularTopping();
                    break;
                case "no":
                    init();
                    running = false;
            }
        } while (running);
    }


    public void makeSandwich() {
        Sandwich sandwich = new Sandwich();

        System.out.println("What size would you like?Enter either 4inch, 8inch, or 12inch");
        int sizeInput = Integer.parseInt(myScanner.nextLine());


        System.out.println("Select your bread:");
        String userSelection = myScanner.nextLine();
        //sandwich.setBread(userSelection);

        System.out.println("would you like your bread toasted? enter yes or no");
        String toastInput = myScanner.nextLine();
        // sandwich.setToastBread(toastInput.equalsIgnoreCase("yes"));

        System.out.println("What meat you like on your sandwich?");
        String meatInput = myScanner.nextLine();
        // sandwich.setMeats(meatInput);

        System.out.println("Would you also like extra meat on your sandwich? enter yes or no");
        String extraMeat = myScanner.nextLine();
        //sandwich.setExtraMeat(extraMeat.equalsIgnoreCase("yes"));

        System.out.println("What type of cheese would you like on your sandwich?");
        String cheeseInput = myScanner.nextLine();
        //sandwich.setCheese(cheeseInput);

        System.out.println("Would you like some extra cheese?Enter yes or no");
        String extraCheeseInput = myScanner.nextLine();
        //sandwich.setExtraCheese(extraCheeseInput.equalsIgnoreCase("Yes"));

        displayRegularTopping();

        System.out.println("What sauce would you like on your sandwich? ");
        String sauceInput = myScanner.nextLine();
        //sandwich.setSauces(sauceInput);

        System.out.println("Would you also like sides? ");
        String sideInput = myScanner.nextLine();
        //sandwich.setSides(sideInput);

        System.out.println("Here is your total for this sandwich:");

        Sandwich newSandwich = new Sandwich(userSelection, sizeInput, toastInput.equalsIgnoreCase("yes"), meatInput, extraMeat.equalsIgnoreCase("yes"), cheeseInput, extraCheeseInput.equalsIgnoreCase("yes"), displayRegularTopping());
        System.out.println(newSandwich.getPrice());
       item.createItem(newSandwich);

    }

    public void addDrink() {
        Drinks newDrink = new Drinks();

        System.out.println("What size drink would you like? Enter small, medium, or large");
        String userSelection = myScanner.nextLine();
        newDrink.setSize(userSelection);

        item.createItem(newDrink);
    }

    public void addChips() {
        Chips newChip = new Chips();

        System.out.println("Adding chips to your order! ");
        item.createItem(newChip);
    }


    public void getOrder() {
        item.displayOrder(item.getOrder());
    }

    public void getTotalPrice() {
        double totalPrice = item.totalPrice();
        System.out.println("Here is your total price of your order: " + totalPrice);
    }

    public ArrayList<Topping> displayRegularTopping() {
        ArrayList<Topping> arrayList = new ArrayList<>();
        Sandwich sandwich = new Sandwich();
        System.out.println("Please select Regular toppings you would prefer! Enter the number you would like ");
        sandwich.displayEnumToppings();

        boolean running = true;
        do {
            System.out.println("Enter your number(enter 10 to finish) : ");
            int userSelection = Integer.parseInt(myScanner.nextLine());
            switch (userSelection) {
                case 1:
                    arrayList.add(Topping.LETTUCE);
                    break;
                case 2:
                    arrayList.add(Topping.PEPPERS);
                    break;
                case 3:
                    arrayList.add(Topping.ONIONS);
                    break;
                case 4:
                    arrayList.add(Topping.TOMATOES);
                    break;
                case 5:
                    arrayList.add(Topping.JALAPENOS);
                    break;
                case 6:
                    arrayList.add(Topping.CUCUMBERS);
                    break;
                case 7:
                    arrayList.add(Topping.PICKLES);
                    break;
                case 8:
                    arrayList.add(Topping.GUACAMOLE);
                    break;
                case 9:
                    arrayList.add(Topping.MUSHROOMS);
                    break;
                case 10:
                    running = false;
            }
        } while (running);
        sandwich.displayCustomerEnumToppings(arrayList);
        return arrayList;

    }

}


