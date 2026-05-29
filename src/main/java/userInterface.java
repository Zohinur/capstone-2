import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
    public Order item = new Order();
    Scanner myScanner = new Scanner(System.in);

    //Saves file and create a new file whenever customer checks out
    public void init() {
        fileManager.saveOrder(item);
    }

    public void display() {
        boolean running = true;
        do {
            System.out.println("Welcome to my Application! ");
            System.out.print("""
                    Press 1 to make Order
                    Press 0 to exit Application
                    Input:""");
            String userSelection = myScanner.nextLine();
            switch (userSelection) {
                case "1":
                    mainMenu();
                    break;
                case "0":
                    running = false;
                    break;
            }
        } while (running);
    }

    //This is the mainMenu to create the user interface
    public void mainMenu() {
        boolean running = true;
        do {
            System.out.println();
            System.out.print("""
                    Welcome to the Big Zo's Deli!!! 🏪
                    
                    What would you like to order?
                    1. Make a Sandwich
                    2. Add Drink
                    3. Add chips
                    4. checkout
                    0. Cancel Order
                    Input:""");
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
                    System.out.print("""
                            Would you like to check out or cancel?
                            press confirm to checkout
                            press cancel to cancel the order
                            Input:""");
                    String userCheck = myScanner.nextLine();
                    //This checks if the order has a sandwich if not it will not allow user to check out
                    if (item.checkSandwich() || item.checkChipDrink()) {
                        if (userCheck.equalsIgnoreCase("confirm")) {
                            checkOut();
                            running =false;
                            break;
                        } else if (userCheck.equalsIgnoreCase("cancel")) {
                            cancelOrder();
                            running = false;
                            break;
                        }
                    } else {
                        System.err.println("You must purchase a drink or a chip if you don't order a sandwich!");
                    }
                case "0":
                    running = false;
                    cancelOrder();
            }
        } while (running);
    }

    //this method removes all the item in the order
    private void cancelOrder() {
        item.removeItem();
    }

    //This creates a new file everytime it is being called
    private void checkOut() {
        init();
    }

    //Creating Sandwich with everything being a method
    public void makeSandwich() {

        Sandwich newSandwich = new Sandwich(displayBread(), getSizeInput(), getToastInput(), displayMeat(), getExtraMeat(), getCheeseInput(), getExtraCheeseInput(), displayRegularTopping(), displaySauces(), displaySides());
        System.out.println();
        System.out.println("Here is your total for this sandwich:");
        System.out.println(newSandwich.getPrice());
        //Adding object sandwich to the ArrayList
        item.createItem(newSandwich);

    }

    //Displaying bread for the customer
    public String displayBread() {
        Sandwich sandwich = new Sandwich();
        //Runs forever until customer selects a bread and if wrong it will loop again
        while (true) {
            System.out.print("""
                    
                    Choose the bread type you would like to use for your sandwich
                    1. White
                    2. Wheat
                    3. rye
                    4. wrap
                    Input:""");
            int userSelection = Integer.parseInt(myScanner.nextLine());

            if (userSelection == 1) {
                sandwich.setBread("White");
                break;
            } else if (userSelection == 2) {
                sandwich.setBread("Wheat");
                break;
            } else if (userSelection == 3) {
                sandwich.setBread("Rye");
                break;
            } else if (userSelection == 4) {
                sandwich.setBread("Wrap");
                break;
            } else {
                System.err.println("Entered number out of range, try again");
            }
        }
        return sandwich.getBread();
    }

    //Getting size and then setting the size to determine the bread
    private int getSizeInput() {
        Sandwich sandwich = new Sandwich();
        while (true) {
            System.out.print("""
                    
                    What size would you like? Enter 4, 8, or 12
                     4 inch = $5.50
                     8 inch = $7.00
                     12 inch = $8.50
                     Input:""");
            int userSelection = Integer.parseInt(myScanner.nextLine());
            if (userSelection == 4) {
                sandwich.setSize(4);
                break;
            } else if (userSelection == 8) {
                sandwich.setSize(8);
                break;
            } else if (userSelection == 12) {
                sandwich.setSize(12);
                break;
            } else {
                System.err.println("Wrong input, Please enter valid input!!");
            }
        }
        return sandwich.getSize();
    }

    //Returns a boolean to get bread toasted based on customer choice
    private boolean getToastInput() {
        while (true) {
            System.out.println();
            System.out.println("would you like your bread toasted? enter yes or no");
            System.out.print("Input:");
            String userSelection = myScanner.nextLine();
            if (userSelection.equalsIgnoreCase("yes")) {
                return true;
            } else if (userSelection.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.err.println("Wrong input, please enter yes or no!");
            }
        }
    }

    //Displays all the meat option and takes the user selection
    public String displayMeat() {
        Sandwich sandwich = new Sandwich();
        while (true) {
            System.out.print("""
                    
                    What meat you would like in your sandwich?
                    1. Steak
                    2. Ham
                    3. Salami
                    4. Roast beef
                    5. Chicken
                    6. Bacon
                    Input:""");

            int userSelection = Integer.parseInt(myScanner.nextLine());

            if (userSelection == 1) {
                sandwich.setMeats("Steak");
                break;
            } else if (userSelection == 2) {
                sandwich.setMeats("Ham");
                break;
            } else if (userSelection == 3) {
                sandwich.setMeats("Salami");
                break;
            } else if (userSelection == 4) {
                sandwich.setMeats("Roast Beef");
                break;
            } else if (userSelection == 5) {
                sandwich.setMeats("Chicken");
                break;
            } else if (userSelection == 6) {
                sandwich.setMeats("Bacon");
                break;
            } else {
                System.err.println("You have entered wrong out of range, please try again");
            }
        }
        return sandwich.getMeats();
    }

    private boolean getExtraMeat() {
        while (true) {
            System.out.println();
            System.out.println("would you like extra meat? enter yes or no");
            System.out.print("Input:");
            String userSelection = myScanner.nextLine();
            if (userSelection.equalsIgnoreCase("yes")) {
                return true;
            } else if (userSelection.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.err.println("Wrong input, please enter yes or no!");
            }
        }
    }

    private String getCheeseInput() {
        Sandwich sandwich = new Sandwich();
        System.out.println("""
                
                What type of cheese would you like on your sandwich?
                1. American
                2. provolone
                3. Cheddar
                4. Swiss""");
        while (true) {
            System.out.print("Input: ");
            int userSelection = Integer.parseInt(myScanner.nextLine());
            if (userSelection == 1) {
                sandwich.setCheese("American");
                break;
            } else if (userSelection == 2) {
                sandwich.setCheese("Provolone");
                break;
            } else if (userSelection == 3) {
                sandwich.setCheese("Cheddar");
                break;
            } else if (userSelection == 4) {
                sandwich.setCheese("Swiss");
                break;
            } else {
                System.err.println("Invalid input, Please try again!");
            }
        }
        return sandwich.getCheese();
    }

    private boolean getExtraCheeseInput() {
        while (true) {
            System.out.println();
            System.out.println("would you like extra Cheese? enter yes or no");
            System.out.print("Input:");
            String userSelection = myScanner.nextLine();
            if (userSelection.equalsIgnoreCase("yes")) {
                return true;
            } else if (userSelection.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.err.println("Wrong input, please enter yes or no!");
            }
        }
    }

    public ArrayList<Topping> displayRegularTopping() {
        Sandwich sandwich = new Sandwich();

        System.out.println();
        System.out.println("Please select Regular toppings you would prefer! Enter the number you would like ");
        sandwich.displayEnumToppings();

        boolean running = true;
        do {
            System.out.println("Enter your number(enter 10 to finish) : ");
            int userSelection = Integer.parseInt(myScanner.nextLine());
            switch (userSelection) {
                case 1:
                    if (!sandwich.containsTopping(Topping.LETTUCE)) {
                        System.out.println("Adding lettuce on your sandwich...");
                        sandwich.addTopping(Topping.LETTUCE);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 2:
                    if (!sandwich.containsTopping(Topping.PEPPERS)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.PEPPERS);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 3:
                    if (!sandwich.containsTopping(Topping.ONIONS)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.ONIONS);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 4:
                    if (!sandwich.containsTopping(Topping.TOMATOES)) {
                        System.out.println("Adding tomatoes on your sandwich...");
                        sandwich.addTopping(Topping.TOMATOES);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 5:
                    if (!sandwich.containsTopping(Topping.JALAPENOS)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.JALAPENOS);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 6:
                    if (!sandwich.containsTopping(Topping.CUCUMBERS)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.CUCUMBERS);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 7:
                    if (!sandwich.containsTopping(Topping.PICKLES)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.PICKLES);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 8:
                    if (!sandwich.containsTopping(Topping.GUACAMOLE)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.GUACAMOLE);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 9:
                    if (!sandwich.containsTopping(Topping.MUSHROOMS)) {
                        System.out.println("Adding peppers on your sandwich...");
                        sandwich.addTopping(Topping.MUSHROOMS);
                    } else {
                        System.err.println("you already have this topping on your sandwich...");
                    }
                    break;
                case 10:
                    running = false;
                    break;
                default:
                    System.err.println("Entered wrong input, please try again");
            }
        } while (running);

        System.out.println("Here are the toppings selected");
        sandwich.displayCustomerEnumToppings(sandwich.getEnumToppings());
        return sandwich.getEnumToppings();

    }

    public ArrayList<Sauces> displaySauces() {
        Sandwich sandwich = new Sandwich();
        System.out.println("Choose what sauces would you like on your sandwich, can't choose the same sauce twice");

        sandwich.displayEnumSauces();
        boolean running = true;
        do {
            System.out.println("Select your sauces based on the number(10 to exit): ");
            int userSelection = Integer.parseInt(myScanner.nextLine());

            switch (userSelection) {
                case 1:
                    if (!sandwich.containsSauces(Sauces.MAYO)) {
                        System.out.println("Adding mayo to your sandwich");
                        sandwich.addSauces(Sauces.MAYO);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 2:
                    if (!sandwich.containsSauces(Sauces.MUSTARD)) {
                        System.out.println("Adding mustard to your sandwich");
                        sandwich.addSauces(Sauces.MUSTARD);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 3:
                    if (!sandwich.containsSauces(Sauces.KETCHUP)) {
                        System.out.println("Adding ketchup to your sandwich");
                        sandwich.addSauces(Sauces.KETCHUP);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 4:
                    if (!sandwich.containsSauces(Sauces.RANCH)) {
                        System.out.println("Adding ranch to your sandwich");
                        sandwich.addSauces(Sauces.RANCH);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 5:
                    if (!sandwich.containsSauces(Sauces.THOUSAND)) {
                        System.out.println("Adding thousand to your sandwich");
                        sandwich.addSauces(Sauces.THOUSAND);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 6:
                    if (!sandwich.containsSauces(Sauces.ISLANDS)) {
                        System.out.println("Adding islands to your sandwich");
                        sandwich.addSauces(Sauces.ISLANDS);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 7:
                    if (!sandwich.containsSauces(Sauces.VINAIGRETTE)) {
                        System.out.println("Adding vinaigrette to your sandwich");
                        sandwich.addSauces(Sauces.VINAIGRETTE);
                    } else {
                        System.err.println("You already have this sauce on your sandwich");
                    }
                    break;
                case 10:
                    running = false;
                    break;
                default:
                    System.err.println("Entered wrong input, please try again");
            }
        } while (running);
        System.out.println("List of sauces in the sandwich: ");
        sandwich.displayCustomerEnumSauces(sandwich.getEnumSauces());
        return sandwich.getEnumSauces();
    }

    //Displays all the options for the sides
    public ArrayList<Sides> displaySides() {
        Sandwich sandwich = new Sandwich();

        System.out.println("Choose the sides you would like");
        sandwich.displaySides();

        boolean running = true;

        do {
            System.out.println("Choose the sides you would like based on the number(10 to exit)");
            String userSelection = myScanner.nextLine();

            switch (userSelection) {
                case "1":
                    if (!sandwich.containsSides(Sides.AUJUS)) {
                        System.out.println("Adding au jus on the side");
                        sandwich.addSides(Sides.AUJUS);
                    } else {
                        System.err.println("You already have this on your order");
                    }
                    break;
                case "2":
                    if (!sandwich.containsSides(Sides.SAUCE)) {
                        System.out.println("Adding Sauce on the side");
                        sandwich.addSides(Sides.SAUCE);
                    } else {
                        System.err.println("You already have this on your order");
                    }
                    break;
                case "10":
                    running = false;
                    break;
                default:
                    System.err.println("Entered the wrong input, please try again!");
            }
        } while (running);

        System.out.println("The sides chosen: ");
        sandwich.displayCustomerSides(sandwich.getEnumSides());
        return sandwich.getEnumSides();
    }

    //Drink section, allowing users to add drink
    public void addDrink() {
        Drinks newDrink = new Drinks();

        System.out.println();
        System.out.println("What size drink would you like? Enter small, medium, or large");
        String userSelection = myScanner.nextLine();
        newDrink.setSize(userSelection);

        item.createItem(newDrink);
    }

    //Adds object chips to item arraylist
    public void addChips() {
        Chips newChip = new Chips();

        System.out.println("Adding chips to your order! ");
        //Adds the object
        item.createItem(newChip);
    }

    //TESTING
    public void getOrder() {
        item.displayOrder(item.getOrder());
    }

    //TESTING
    public void getTotalPrice() {
        double totalPrice = item.totalPrice();
        System.out.println();
        System.out.println("Here is your total price of your order: " + totalPrice);
    }
}


