
package hotel;


public class Room {
    String roomName;
    int roomNumber;
    int floor;
    int roomStars;
    int startDate;
    int endDate;

    public Room(String roomDescription, int roomStars, int roomNumber, int floor) {
        this.roomName = roomDescription;
        this.roomStars = roomStars;
        this.roomNumber = roomNumber;
        this.floor = floor;
        
    }

    @Override
    public String toString() {
        return "Room description: " + roomName + 
               "Room Number: " + roomNumber +
               "Floor: " + floor + 
               "Stars: " + roomStars + 
               "Resevation start date: " + startDate + 
               "Resevation end date: " + endDate;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomName = roomDescription;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoomStars(int roomStars) {
        this.roomStars = roomStars;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getRoomDescription() {
        return roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoomStars() {
        return roomStars;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }
    
}
