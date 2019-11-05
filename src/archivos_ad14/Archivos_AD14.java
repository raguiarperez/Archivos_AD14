/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_ad14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author dam2
 */
public class Archivos_AD14 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws XMLStreamException, IOException {
        
        //Creamos el File para poder crear el archivo y el writer para poder escribir en el
        File fil= new File("/home/oracle/Desktop/Archivos/autores.xml");
	FileWriter escribir = new FileWriter(fil);
        
        XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(escribir); 
        
        
	

        
        writer.writeStartDocument("1.0");
        writer.writeStartElement("autores");
        writer.writeStartElement("autor");
        writer.writeAttribute("codigo", "a1");
        writer.writeStartElement("nome");
        writer.writeCharacters("Alexandre Dumas");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("El conde de montecristo");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("Los miserables");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeStartElement("autor");
        writer.writeAttribute("codigo", "a2");
        writer.writeStartElement("nome");
        writer.writeCharacters("Fiodor Dostoyevski");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("El idiota");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("Noches blancas");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument(); 
        writer.close();
       
    }
}
