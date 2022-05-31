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

    //Rooms test

    HotelManager hotelManager = new HotelManager();
    Room nRoom = new Room("Suite", 27, 2, 345, false);
    hotelManager.changeRoomPrice(2, 230);
    hotelManager.addExtraBed(5);
    hotelManager.setRoomAsBooked(1);
    hotelManager.addRoom(nRoom);



    System.out.println("");
    System.out.println("///////////////////");
    System.out.println("");


    //Reservations test

    Guest guest1 = new Guest("Santiago", "Gómez", "Spanish", new Date(21,6,2002), 654055065);

    ReservationList reservationList = new ReservationList();
    Reservation reservation1 = new Reservation(guest1, new Date(6,6,2022), new Date(10,6,2022),
        hotelManager.roomList.getRoomByNumber(2));
    reservationList.getReservationList().add(reservation1);
    System.out.println(reservationList.getReservationList());
    System.out.println(hotelManager.getFreeRooms());


  }
}



