package abrir_recorrer_xml_sax;

import java.util.jar.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

public class LibrosSAXhandler extends DefaultHandler {
    
    public LibrosSAXhandler() {}

    public void startElement(String uri, String localName, String qName, Attributes atts)throws SAXException{
        
        if(qName.equals("Libro")){
            System.out.println("Publicado en: "+atts.getValue(atts.getQName(0)));
        }else if(qName.equals("Titulo")){
            System.out.println("\n"+"El titulo es: ");
        }else if(qName.equals("Autor")){
            System.out.println("\n"+"El autor es: ");
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("Libro")){
            System.out.println("\n--------------------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       String car=new String(ch, start,length);
       car=car.replaceAll("\t", "");
       car=car.replaceAll("\n", "");
        System.out.println(car);
       
       
        
    }
    
    
    
    
    

    
    
}
