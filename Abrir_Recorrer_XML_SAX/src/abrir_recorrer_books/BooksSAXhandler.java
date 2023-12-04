package abrir_recorrer_books;

import abrir_recorrer_xml_sax.*;
import java.util.jar.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BooksSAXhandler extends DefaultHandler {
    
    public BooksSAXhandler() {}

    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws SAXException {
        //Compara el parametro con la etiqueta y realiza una accion en caso de ser cierta
        if(qName.equals("book")){
            System.out.println("Su ID es: "+atts.getValue(atts.getQName(0)));//Nos muestra el ID del libro
        }else if(qName.equals("author")){
            System.out.print("\n"+"El autor es: ");
        }else if(qName.equals("title")){
            System.out.print("El titulo es: ");
        }else if(qName.equals("genre")){
            System.out.print("Su genero es: ");
        }else if(qName.equals("price")){
            System.out.print("Su precio es: ");
        }else if(qName.equals("publish_date")){
            System.out.print("La fecha de publicacion es: ");
        }else if(qName.equals("description")){
            System.out.print("Descripcion: ");
        }
    }
    @Override
    //Este metodo nos sirve para separar cada uno de los libros que contenga el XML
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("book")){
            System.out.println("--------------------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //Convertirmos en una cadena entera los caracteres y eliminamos los espacios junto a los saltos de linea
       String car=new String(ch, start,length);
       car=car.replaceAll("\t", "");
       car=car.replaceAll("\n", "");
        System.out.println(car);       //Imprime la cadena entera modificada
    }   
}
