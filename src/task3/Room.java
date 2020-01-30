package task3;

public class Room {
    private int roomSize;
    private  int actualTemparature;
    private boolean aircondition;
    private static int minTemperature = 16;

    public static int getMinTemperature() {
        return minTemperature;
    }



    Room(int roomSize, int actualTemparature, boolean aircondition){
        this.roomSize = roomSize;
        this.actualTemparature = actualTemparature;
        this.aircondition = aircondition;
    }

   public boolean changeTemperature(){
        if(aircondition == true && actualTemparature > minTemperature){
           if(roomSize < 10){
               actualTemparature = actualTemparature-2;
           } else {
               actualTemparature = actualTemparature-1;
           }
            return true;
        } else {
            return false;
        }
   }


    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public int getActualTemparature() {
        return actualTemparature;
    }

    public void setActualTemparature(int actualTemparature) {
        this.actualTemparature = actualTemparature;
    }
}

