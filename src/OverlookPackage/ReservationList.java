package OverlookPackage;

import java.util.ArrayList;

public class ReservationList
{
  //Fields
  //=======================
  private ArrayList<Reservation> reservationList;

  //=======================
  public ReservationList()
  {
    this.reservationList = new ArrayList<>();
  }

  //Setters
  //=======================
  public void set(Reservation reservation, int index)
  {
    reservationList.add(index, reservation);
  }
  //=======================

  //Getters
  //=======================
  public Reservation get(int index)
  {
    return reservationList.get(index);
  }

  public int getIndex(Guest guest)
  {
    int index=0;
    for(int i=0;i<reservationList.size();i++)
    {
      if(reservationList.get(i).getMainGuest().equals(guest))
      {
        index = i;
      }
      else
        return 0;
    }
    return index;
  }

  public Reservation get(Guest guest)
  {
    Reservation reservation = null;
    for(int i=0;i<reservationList.size();i++)
    {
      if(reservationList.get(i).getMainGuest().equals(guest))
      {
        reservation = reservationList.get(i);
      }
      else
        return null;
    }
    return reservation;
  }

  public  ArrayList<Reservation> getReservationList()
  {
    return reservationList;
  }
  //=======================

  //Size
  //=======================
  public int size()
  {
    return reservationList.size();
  }
  //=======================

  //ToString
  //=======================
  public String toString()
  {
    return "Number of Reservations: "+reservationList.size();
  }

}