package OverlookPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "room")
public class Room
{
  private String roomType;
  private int roomNum;
  private int bedNum;
  private int price;
  private boolean isInReservation;

  public Room()
  {
  }

  public Room(String type, int roomNum, int beds, int price, boolean isInReservation)
  {
    this.roomType = type;
    this.price = price;
    this.bedNum = beds;
    this.roomNum = roomNum;
    this.isInReservation = isInReservation;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public void setBeds(int beds)
  {
    this.bedNum = beds;
  }

  public void setType(String type)
  {
    this.roomType = type;
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
    return roomType;
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
    return bedNum;
  }


  public int getRoomNum()
  {
    return roomNum;
  }

  @Override public String toString()
  {
    return
        "\nType of room: " + roomType +
            "\nRoom number: " + roomNum +
            "\nprice: " + price +
            "\nNumber of beds: " + bedNum +
            "\nHas been booked: " + isInReservation + "\n";
  }
}