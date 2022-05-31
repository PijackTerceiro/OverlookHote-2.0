package OverlookPackage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HotelManager
{
  RoomList roomList = new RoomList();
public HotelManager()
{
  roomList.dataWriter();
}

public void changeRoomPrice(int roomNumber, int newPrice)
{
  roomList.getRoomByNumber(roomNumber).setPrice(newPrice);
  roomList.dataWriter();
}

public void addExtraBed(int roomNumber)
{
  roomList.getRoomByNumber(roomNumber).setBeds(roomList.getRoomByNumber(roomNumber).getBeds()+1);
  roomList.dataWriter();
}

public void setRoomAsBooked(int roomNumber)
{
  roomList.getRoomByNumber(roomNumber).setInReservation(true);
  roomList.dataWriter();
}

public void setRoomAsFree(int roomNumber)
{
  roomList.getRoomByNumber(roomNumber).setInReservation(false);
  roomList.dataWriter();
}

public void addRoom(Room newRoom)
{
  roomList.addRoom(newRoom);
}

public RoomList getRoomList()
{
  return roomList;
}

public RoomList getFreeRooms()
{
  RoomList r = new RoomList();
  r.getRooms().clear();
  for(int i=0; i< roomList.size(); i++)
  {
    if(roomList.getRooms().get(i).getIsInReservation() == false)
    {
      r.aRoom(roomList.getRooms().get(i));
    }
  }

  return r;
}



}