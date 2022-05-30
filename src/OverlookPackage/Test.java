package OverlookPackage;

import java.io.Serializable;

public class Test
{
  public static void main(String[] args)
  {
    String fileName = "src/Resources/roomsFile.xml";
    HotelManager hotelManager = new HotelManager();
    RoomList rooms = new RoomList();
    hotelManager.changeRoomPrice(2, 220);
    System.out.println(hotelManager.getAllRooms(fileName));



  }
}
