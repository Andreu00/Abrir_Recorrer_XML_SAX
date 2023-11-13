/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abrir_recorrer_xml_sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author maget
 */
public class TitulosSAXhandler extends DefaultHandler{
    private String etiqueta;
    
    public TitulosSAXhandler(){
        etiqueta="";
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("LISTA DE TITULOS");
        System.out.println("================");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if(qName.equals("Libro")){
            etiqueta="Libro";
        }else if(qName.equals("Titulo")){
            etiqueta="Titulo";
        }else if(qName.equals("Autor")){
            etiqueta="Autor";
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       if(etiqueta.equals("Titulo")){
           String car=new String(ch, start, length);
           car=car.replaceAll("\t", "");
           car=car.replaceAll("\n", "");
           System.out.println(car); 
       }
    }
    
    
    
    
    
            
}
