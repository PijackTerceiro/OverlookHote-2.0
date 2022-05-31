package OverlookPackage;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rooms")
public class RoomList
{
  @XmlElement(name = "room", type = Room.class)
  private List<Room> rooms = new ArrayList<Room>();


  public RoomList()
  {
    Room room1 = new Room("Room", 1, 1, 129, false);
    Room room2 = new Room("Room", 2, 1, 129, true);
    Room room3 = new Room("Room", 3, 1, 129, true);
    Room room4 = new Room("Room", 4, 1, 129, false);
    Room room5 = new Room("Room", 5, 1, 129, false);
    Room room6 = new Room("Room", 6, 1, 129, true);
    Room room7 = new Room("Room", 7, 1, 129, false);
    Room room8 = new Room("Room", 8, 1, 129, false);
    Room room9 = new Room("Room", 9, 1, 129, true);
    Room room10 = new Room("Room", 10, 1, 129, true);
    Room room11 = new Room("Room", 11, 1, 129, true);
    Room room12 = new Room("Room", 12, 2, 169, false);
    Room room13 = new Room("Suite", 38, 2, 339, false);
    Room room14 = new Room("Suite", 39, 2, 339, false);
    Room room15 = new Room("Suite", 40, 2, 339, true);
    Room room16 = new Room("Suite", 41, 2, 339, false);
    rooms.add(room1);
    rooms.add(room2);
    rooms.add(room3);
    rooms.add(room4);
    rooms.add(room5);
    rooms.add(room6);
    rooms.add(room7);
    rooms.add(room8);
    rooms.add(room9);
    rooms.add(room10);
    rooms.add(room11);
    rooms.add(room12);
    rooms.add(room13);
    rooms.add(room14);
    rooms.add(room15);
    rooms.add(room16);
  }

  public RoomList(List<Room> rooms)
  {
    this.rooms = rooms;
  }

  //method for the unmarshal
  public List<Room> getRooms()
  {
    return rooms;
  }

  public void setRooms(List<Room> rooms)
  {
    this.rooms=rooms;
    dataWriter();
  }

  public void addRoom(Room room)
  {
    rooms.add(room);
    dataWriter();
  }

  public void aRoom(Room room)
  {
    rooms.add(room);
  }

  //Method to retrieve all the rooms from xml
  public List<Room> dataWriter()
  {

    {
      //Marshalling: Writing Java objects to XMl file
      try
      {
        JAXBXMLHandler.marshal(rooms, new File("rooms.xml"));
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      catch (JAXBException e)
      {
        e.printStackTrace();
      }

      //Unmarshalling: Converting XML content to Java objects
      try {
        rooms = JAXBXMLHandler.unmarshal(new File("rooms.xml"));
      } catch (JAXBException e) {
        e.printStackTrace();
      }
    }
    return rooms;
  }

  public void setRoom(Room room, int index)
  {
    rooms.add(index, room);
    dataWriter();
  }

  public Room getRoomByNumber(int roomNumber)
  {
    Room room = new Room();

    for(int i=0; i<rooms.size(); i++)
    {
      if(rooms.get(i).getRoomNum()==roomNumber)
      {
        room = rooms.get(i);
      }
    }
    return room;
  }

  public int getIndex(int roomNum)
  {
    int ind = 0;
    for (int i=0; i<rooms.size(); i++)
    {
      if(roomNum == rooms.get(i).getRoomNum())
      {
        ind = i;
      }
    }
    return ind;
  }

  public int size()
  {
    return rooms.size();
  }


  public String toString()
  {
    return "Rooms' info: " + rooms;
  }
}
