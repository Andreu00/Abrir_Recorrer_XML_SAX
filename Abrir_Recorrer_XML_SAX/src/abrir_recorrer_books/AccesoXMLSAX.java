/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abrir_recorrer_books;

import abrir_recorrer_xml_sax.*;
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
    //Permite interpretar el XML usando SAX
    SAXParser parser;
    
    public int parsearXMLconLibrosSAXhandler(File f){
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();//Para leer los XML con el metodo SAX
            parser=factory.newSAXParser();
            BooksSAXhandler sh=new BooksSAXhandler();//Metodo que te maneja y te duvuelve todos los datos del Libro
            parser.parse(f, sh);//Leemos el XML con el fichero que le pasamos y el controlador de la informacion
            return 0;
        } catch (Exception ex) { 
            ex.printStackTrace();
            return -1;
        }
    }
    
    public int parsearXMLconTitulosSAXhandler(File f){
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();//Para leer los XML con el metodo SAX
            parser=factory.newSAXParser();
            TitulosSAXhandler sh=new TitulosSAXhandler();//Metodo para mostrar solamente el titulo de los libros
            parser.parse(f, sh);//Leemos el XML con el fichero que le pasamos y el controlador de la informacion
            return 0;
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

}
