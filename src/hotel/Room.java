
package hotel;


public class Room {
    String roomName;
    int roomNumber;
    int floor;
    int roomStars;
    int startDate;
    int endDate;
    boolean reserved;

    public Room(String roomName, int roomStars, int roomNumber, int floor) {
        this.roomName = roomName;
        this.roomStars = roomStars;
        this.roomNumber = roomNumber;
        this.floor = floor;
        
    }

    @Override
    public String toString() {
        return "\n\tRoom name: " + roomName + 
               "\n\tRoom Number: " + roomNumber +
               "\n\tFloor: " + floor + 
               "\n\tStars: " + roomStars + 
               "\n\tResevation start date: " + startDate + 
               "\n\tResevation end date: " + endDate;
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
