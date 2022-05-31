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

    /*RoomList roomList = new RoomList();
    Room nRoom = new Room("Suite", 23, 2, 339, false);
    roomList.dataWriter();
    roomList.addRoom(nRoom);

    System.out.println(roomList);*/

    HotelManager hotelManager = new HotelManager();
    Room nRoom = new Room("Suite", 27, 2, 345, false);
    hotelManager.changeRoomPrice(2, 230);
    hotelManager.addExtraBed(5);
    hotelManager.setRoomAsBooked(1);
    hotelManager.addRoom(nRoom);
    hotelManager.setRoomAsFree(1);
    System.out.println(hotelManager.getFreeRooms());





  }
}



