package Latihan;

// Created by 21343043_Fadhil Nugraha Wikarya

public class ElevatorTest {
    public static void main(String[] args) {
        Latihan.Elevator myElevator = new Latihan.Elevator();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
    }
}
