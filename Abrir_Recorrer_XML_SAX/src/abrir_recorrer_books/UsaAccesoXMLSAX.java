package abrir_recorrer_books;

import abrir_recorrer_xml_sax.*;
import java.io.File;

public class UsaAccesoXMLSAX {
    
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("books.xml");
        AccesoXMLSAX a=new AccesoXMLSAX();
        
        a.parsearXMLconLibrosSAXhandler(f);
    }
    
}
