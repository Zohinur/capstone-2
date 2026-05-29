import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileManager {

    //Created method to save the order and create a file to display the order details.
    public static void saveOrder(Order order) {
        //Used the formatter to format it certain way so it can name the file.
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String dateTime = now.format(format);

        //todo see note in teams re: making folder
        //This folder is where the file is being created and saved.
        String folder = "src/main/resources/receipt/";
        String fileName = dateTime + ".txt";


        try {
            FileWriter writer = new FileWriter(folder + fileName);
            BufferedWriter buff = new BufferedWriter(writer);

            buff.write(order.toString());
            buff.newLine();
            buff.flush();
            //Creates new file
            buff.close();
        } catch (IOException e) {
            System.err.println("File not found, Try again " + e);
        }
    }
}





