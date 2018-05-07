package hotel;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Jesper
 */
public class Display {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat;
    
    
            
    public void startUpMessage() {
        System.out.println("\nWelcome to the Hotel California!"
                + "\nPlease identify yourself."
                + "\nAre you an Admin?"
                + "\nor an Customer?");
    }
    
    public void welcomeMessageCustomer() {
        System.out.println("Welcome to the hotel California!" 
                   + "Here you can make a room reservation");   
    }
    
    public String playerInput() {
        System.out.print("> ");
        String input = sc.nextLine().toLowerCase();
        return input;
    }
    
    public void getDate() {
        //(SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/DD");
        System.out.println("What year are you going to book?");
        int year = sc.nextInt();
        year = Integer.parseInt("");
        System.out.println("What month do you want to reserve a room? ex. 05 = May");
        int month = sc.nextInt();
        month = Integer.parseInt("");
        System.out.println("Whats the day of the month?");
        int day = sc.nextInt();
        day = Integer.parseInt("DD");
        //dateFormat = new SimpleDateFormat(year/month/day);
        LocalDate ld = LocalDate.of(year,month,day);
        System.out.println(ld);
        
    }
}
