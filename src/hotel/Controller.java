package hotel;

import java.io.Serializable;
import java.util.ArrayList;

public class Controller implements Serializable {

    Display display = new Display();
    ArrayList<Room> notReserved = new ArrayList<>();
    ArrayList<Room> reserved = new ArrayList<>();
    Room presidentialRoom1 = new Room("Presidential room", 5, 401, 4);
    Room presidentialRoom2 = new Room("Presidential room", 5, 402, 4);
    Room deluxRoom1 = new Room("Deluxe room", 4, 301, 3);
    Room deluxRoom2 = new Room("Deluxe room", 4, 302, 3);
    Room deluxRoom3 = new Room("Deluxe room", 4, 303, 3);
    Room deluxRoom4 = new Room("Deluxe room", 4, 304, 3);
    Room superiorRoom1 = new Room("Superior room", 3, 201, 2);
    Room superiorRoom2 = new Room("Superior room", 3, 202, 2);
    Room superiorRoom3 = new Room("Superior room", 3, 203, 2);
    Room superiorRoom4 = new Room("Superior room", 3, 204, 2);
    Room superiorRoom5 = new Room("Superior room", 3, 205, 2);
    Room superiorRoom6 = new Room("Superior room", 3, 206, 2);
    Room standardRoom1 = new Room("Standard room", 2, 101, 1);
    Room standardRoom2 = new Room("Standard room", 2, 102, 1);
    Room standardRoom3 = new Room("Standard room", 2, 103, 1);
    Room standardRoom4 = new Room("Standard room", 2, 104, 1);
    Room standardRoom5 = new Room("Standard room", 2, 105, 1);
    Room standardRoom6 = new Room("Standard room", 2, 106, 1);
    Room standardRoom7 = new Room("Standard room", 2, 107, 1);
    Room standardRoom8 = new Room("Standard room", 2, 108, 1);
    Room standardRoom9 = new Room("Standard room", 2, 109, 1);
    Room standardRoom10 = new Room("Standard room", 2, 110, 1);

    public void start() {
        display.startUpMessage();
        switch (display.playerInput()) {
            case "customer":
            case "1":
                startCustomer();                
            case "admin":
            case "2":
        }
    }
    
    public void startAdmin() {
        
    }
    
    public void startCustomer() {
        display.welcomeMessageCustomer();
        while (true) {
            customerControll();
        }
    }

    public void customerControll() {
        switch (display.playerInput()) {
            case "5 stars":
            case "the best":
            case "Presidential":
                getPresidentialRooms();
            case "4 stars":
                getDeluxeRooms();
        }

    }

    public void getPresidentialRooms() {
        notReserved.add(presidentialRoom1);
        notReserved.add(presidentialRoom2);
        for (int i = 0; i < notReserved.size(); i++) {
            System.out.println(notReserved.get(i));
        }
    }

    public void getDeluxeRooms() {
        notReserved.add(deluxRoom1);
        notReserved.add(deluxRoom2);
        notReserved.add(deluxRoom3);
        notReserved.add(deluxRoom4);
        for (int i = 0; i < notReserved.size(); i++) {
            System.out.println(notReserved.get(i));
        }
    }

    public void addRooms() {
        for (int i = 0; i < notReserved.size(); i++) {
            System.out.println(notReserved.get(i));
        }
    }
}
