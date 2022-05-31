package OverlookPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;

public class Test
{
  public static void main(String[] args)
  {
    Room room1 = new Room("Room", 1, 1, 129, false);
    Room room2 = new Room("Room", 2, 1, 129, false);
    Room room3 = new Room("Room", 3, 1, 129, false);
    Room room4 = new Room("Room", 4, 1, 129, false);
    Room room5 = new Room("Room", 5, 1, 129, false);
    Room room6 = new Room("Room", 6, 1, 129, false);
    Room room7 = new Room("Room", 7, 1, 129, false);
    Room room8 = new Room("Room", 8, 1, 129, false);
    Room room9 = new Room("Room", 9, 1, 129, false);
    Room room10 = new Room("Room", 10, 1, 129, false);
    Room room11 = new Room("Room", 11, 1, 129, false);
    Room room12 = new Room("Room", 12, 2, 169, false);
    Room room13 = new Room("Suite", 38, 2, 339, false);
    Room room14 = new Room("Suite", 39, 2, 339, false);
    Room room15 = new Room("Suite", 40, 2, 339, false);
    Room room16 = new Room("Suite", 41, 2, 339, false);


    RoomList roomList = new RoomList();

    roomList.addRoom(room1);
    roomList.addRoom(room2);
    roomList.addRoom(room3);
    roomList.addRoom(room4);
    roomList.addRoom(room5);
    roomList.addRoom(room6);
    roomList.addRoom(room7);
    roomList.addRoom(room8);
    roomList.addRoom(room9);
    roomList.addRoom(room10);
    roomList.addRoom(room11);
    roomList.addRoom(room12);
    roomList.addRoom(room13);
    roomList.addRoom(room14);
    roomList.addRoom(room15);
    roomList.addRoom(room16);

    roomList.getRoomByNumber(2).setPrice(210);
    roomList.setRoomIsInReservation(roomList.getRoomByNumber(2).getRoomNum());



    System.out.println(roomList.getAllRooms());

  }
}



