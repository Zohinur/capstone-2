import java.util.Scanner;

public class userInterface {
    public Order item = new Order();
    Scanner myScanner = new Scanner(System.in);

    public void userinterface(){

    }


    public sandwich makeSandwich(){
        sandwich sandwich = new sandwich();

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





    }

}
