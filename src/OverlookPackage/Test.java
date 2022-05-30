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
    List<Room> rooms = new ArrayList<>();

    Room room1 = new Room("Room", 1, 1, 129, false);
    Room room2 = new Room("Room", 2, 1, 129, false);
    Room room3 = new Room("Room", 3, 1, 129, false);
    Room room4 = new Room("Room", 4, 1, 129, false);
    Room room5 = new Room("Room", 5, 1, 129, false);
    Room room6 = new Room("Room", 6, 1, 129, false);
    Room room7 = new Room("Room", 7, 1, 129, false);
    Room room8 = new Room("Room", 8, 1, 129, false);
    Room room9 = new Room("Room", 9, 1, 129, false);
    Room room10 = new Room("Room", 10, 1, 129, false);
    Room room11 = new Room("Room", 11, 1, 129, false);

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

    rooms.get(1).setPrice(200);

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
    System.out.println(rooms);
  }
}



