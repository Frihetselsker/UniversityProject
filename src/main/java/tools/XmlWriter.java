package tools;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import models.FullInfo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XmlWriter {
    public final static Logger logger = Logger.getLogger(XmlWriter.class.getName());
    private XmlWriter(){

    }

    public static void createXMLRequest(FullInfo fullInfo) {
        try {
            logger.log(Level.INFO, "XML marshalling has started");
            JAXBContext jaxbContext = JAXBContext.newInstance(FullInfo.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            try {
                Files.createDirectory(Paths.get("xmlReqs"));
                logger.log(Level.INFO, "Directory was created successfully");
            } catch (IOException e) {
                logger.log(Level.FINE, "Directory is already created", e);
            }
            File requestFile = new File("xmlReqs/infoReq" + new Date().getTime() + ".xml");
            marshaller.marshal(fullInfo, requestFile);
        } catch (JAXBException e){
            logger.log(Level.SEVERE, "XML marshalling failed", e);
            return;
        }
        logger.log(Level.INFO, "XML marshalling completed successfully");
    }
}
