package OverlookPackage;

import java.io.Serializable;


public class Room implements Serializable
{
  private String type;
  private int roomNum;
  private int beds;
  private int price;
  private boolean isInReservation;

  public Room()
  {
    type = null;
    price = 0;
    beds = 0;
    roomNum = 0;
    isInReservation = false;
  }

  public Room(String type, int roomNum, int beds, int price, boolean isInReservation)
  {
    this.type = type;
    this.price = price;
    this.beds = beds;
    this.roomNum = roomNum;
    this.isInReservation = isInReservation;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public void setBeds(int beds)
  {
    this.beds = beds;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setRoomNum(int roomNum)
  {
    this.roomNum = roomNum;
  }

  public int getPrice()
  {
    return price;
  }

  public String getType()
  {
    return type;
  }

  public boolean getIsInReservation()
  {
    return isInReservation;
  }

  public void setInReservation(boolean isInReservation)
  {
    this.isInReservation = isInReservation;
  }

  public int getBeds()
  {
    return beds;
  }

  public int getRoomNum()
  {
    return roomNum;
  }

  @Override public String toString()
  {
    return
        "\nType of room: " + type +
            "\nRoom number: " + roomNum +
            "\nprice: " + price +
            "\nNumber of beds: " + beds +
            "\nHas been booked: " + isInReservation + "\n";
  }
}