package OverlookPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Date;

public class Reservation implements Serializable
{
  private ArrayList<Guest> guests;
  private Guest mainGuest;
  private Date checkIn;
  private Date checkOut;
  private Room room;

  public Reservation(Guest guest, Date checkIn, Date checkOut, Room room)
  {
    mainGuest = guest;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    this.room = room;
  }

  public void addGuest(Guest guest)
  {
    guests.add(guest);
  }



  /*public boolean isUnderage(Guest guest)
  {
    {
      GregorianCalendar currentDate = new GregorianCalendar();
      int age = currentDate.get(GregorianCalendar.YEAR) - guest.getBirthday().getYear();

      if (age >= 18)
      {

        if (currentDate.get(GregorianCalendar.MONTH) + 1 < guest.getBirthday()
            .getMonth())
          age = currentDate.get(GregorianCalendar.YEAR) - (1 + guest.getBirthday().getYear());

        if (currentDate.get(GregorianCalendar.MONTH) + 1
            == guest.getBirthday().getMonth())
        {

          if (currentDate.get(GregorianCalendar.DATE) <= guest.getBirthday().getDay())
            age = currentDate.get(GregorianCalendar.YEAR) - (1 + guest.getBirthday().getYear());
        }
        if (age >= 18)
        {
          return false;
        }
        else
          return true;
      }
      return true;
    }
  }*/

  //Methods to check the availability.
  public Date getCheckIn()
  {
    return checkIn;
  }

  public Date getCheckOut()
  {
    return checkOut;
  }

  public Room getRoom()
  {
    return room;
  }

  public Guest getMainGuest()
  {
    return mainGuest;
  }

  public void setMainGuest(Guest mainGuest)
  {
    this.mainGuest=mainGuest;
  }

  public void setCheckIn(Date checkIn)
  {
    this.checkIn=checkIn;
  }

  public void setCheckOut(Date checkOut)
  {
    this.checkOut=checkOut;
  }

  public void setRoom(Room room)
  {
    this.room=room;
  }


  @Override public String toString()
  {
    return "\nReservation:" + "\nMain Guest " + mainGuest + "\n"
        + guests + "\nExpected arrival: " + checkIn +
        "\nExpected departure: " + checkOut + "\n" +
        "\nAccommodation: " + room ;
  }
}
