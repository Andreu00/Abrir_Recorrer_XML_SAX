/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abrir_recorrer_xml_sax;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author maget
 */
public class AccesoXMLSAX {
    SAXParser parser;
    
    public int parsearXMLconLibrosSAXhandler(File f){
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();
            parser=factory.newSAXParser();
            LibrosSAXhandler sh=new LibrosSAXhandler();
            parser.parse(f, sh);
            return 0;
        } catch (Exception ex) { 
            ex.printStackTrace();
            return -1;
        }
    }
    
    public int parsearXMLconTitulosSAXhandler(File f){
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();
            parser=factory.newSAXParser();
            TitulosSAXhandler sh=new TitulosSAXhandler();
            parser.parse(f, sh);
            return 0;
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

}
