package OverlookPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
  }

  public RoomList(List<Room> rooms)
  {
    this.rooms = rooms;
  }

  public List<Room> getRooms()
  {
    return rooms;
  }

  public void setRooms(List<Room> rooms)
  {
    this.rooms=rooms;
  }

  public void addRoom(Room room)
  {
    rooms.add(room);
  }


  public void setRoom(Room room, int index)
  {
    rooms.add(index, room);
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

  public void setRoomIsInReservation(int roomNumber)
  {
    for(int i=0; i<rooms.size(); i++)
    {
      if(roomNumber == rooms.get(i).getRoomNum())
      {
        rooms.get(i).setInReservation(true);
      }
    }
  }

  public String toString()
  {
    return "Rooms' info: " + rooms;
  }
}
