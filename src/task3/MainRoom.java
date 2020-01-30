package task3;

public class MainRoom {
    public static void main(String[] args) {
        Room room = new Room(18, 18,true);
        showInfo(room);
        room.changeTemperature();
        showInfo(room);
        room.changeTemperature();
        showInfo(room);
        room.changeTemperature();
        showInfo(room);

        Room room2 = new Room(9, 21,true);
        showInfo(room2);
        room2.changeTemperature();
        showInfo(room2);

        Room room3 = new Room(20, 21,false);
        showInfo(room3);
        room3.changeTemperature();
        showInfo(room3);


    }
    public static void showInfo(Room room){
        System.out.println("Temperatura w pokoju wynosi: " + room.getActualTemparature());
    }
}
