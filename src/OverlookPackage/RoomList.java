package OverlookPackage;

import java.util.ArrayList;

public class RoomList
{
  private ArrayList<Room> rooms;

  public RoomList()
  {
    rooms = new ArrayList<>();
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

  public ArrayList<Room> getRooms()
  {
    return rooms;
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
