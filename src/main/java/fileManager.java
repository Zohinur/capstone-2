import java.io.*;

public class fileManager {
    public static String filePath = "src/main/resources/receipt.txt";

    public static void getOrder(Order order) {
        try (
                FileWriter writer = new FileWriter(filePath, true);
                BufferedWriter buff = new BufferedWriter(writer);
        ) {
            buff.write(order.toString());
            buff.newLine();
        } catch (
                IOException e) {
            System.err.println("File not found, Try again " + e);
        }
    }
}


