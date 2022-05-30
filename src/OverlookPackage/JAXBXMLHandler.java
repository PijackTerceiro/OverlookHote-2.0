package OverlookPackage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class JAXBXMLHandler
{
  public static void marshal(List<Room> rooms, File fileName)
      throws IOException, JAXBException {
    JAXBContext context;
    BufferedWriter writer = null;
    writer = new BufferedWriter(new FileWriter(fileName));
    context = JAXBContext.newInstance(RoomList.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    m.marshal(new RoomList(rooms), writer);
    writer.close();
  }
  public static List<Room> unmarshal(File fileName) throws JAXBException {
    RoomList roomList = new RoomList();

    JAXBContext context = JAXBContext.newInstance(RoomList.class);
    Unmarshaller um = context.createUnmarshaller();
    roomList = (RoomList) um.unmarshal(fileName);

    return roomList.getRooms();
  }

}
