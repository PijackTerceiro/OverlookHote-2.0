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
import java.util.ArrayList;
import java.util.List;

public class HotelManager
{
  public HotelManager()
  {
  }

  //It's not unmarshalling but other method to retreive info from xml
  public RoomList getAllRooms(String fileName)
  {
    RoomList rooms = new RoomList();
    {
      try
      {
        //creating a constructor of file class and parsing an XML file
        File file = new File(fileName);
        //an instance of factory that gives a document builder
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //an instance of builder to parse the specified xml file
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("rooms");
        // nodeList is not iterable, so we are using for loop
        for (int itr = 0; itr < nodeList.getLength(); itr++)
        {
          Node node = nodeList.item(itr);
          System.out.println("\n");
          if (node.getNodeType() == Node.ELEMENT_NODE)
          {
            Element eElement = (Element) node;

            //Converts text into integer so it can be added to a Room object

            int roomNumber = Integer.parseInt(eElement.getElementsByTagName("roomNum").item(0).getTextContent());
            int numbOfBeds = Integer.parseInt(eElement.getElementsByTagName("bedNum").item(0).getTextContent());
            int price = Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent());
            boolean isInreservation = false;

            Room room = new Room(eElement.getElementsByTagName("roomType").item(0).getTextContent(), roomNumber, numbOfBeds, price, isInreservation);
            System.out.println(room);
            rooms.addRoom(room);

          }
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    } return rooms;
  }

  public void changeRoomPrice(int roomNumber, int newPrice)
  {
    RoomList rooms = getAllRooms("src/Resources/roomsFile.xml");
    for(int i=0; i<rooms.getRooms().size(); i++)
    {
      if(roomNumber==rooms.getRooms().get(i).getRoomNum())
      {
        rooms.getRooms().get(i).setPrice(newPrice);
      }
    }
  }

}