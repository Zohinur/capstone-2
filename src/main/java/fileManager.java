import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileManager {

    public static void getOrder(Order order) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String dateTime = now.format(format);

        String folder = "src/main/resources/receipt/";
        String fileName = dateTime + ".txt";


        try {
            FileWriter writer = new FileWriter(folder + fileName);
            BufferedWriter buff = new BufferedWriter(writer);

            buff.write(order.toString());
            buff.newLine();
            buff.flush();
            buff.close();

        } catch(IOException e){
            System.err.println("File not found, Try again " + e);
        }
    }
//    try{
//
//    }catch (){

    }





