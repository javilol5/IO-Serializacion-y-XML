package javier.casal;

import java.io.FileWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class Parte3 {

    public static void main(String[] args) {

        try {

            FileWriter fichero = new FileWriter("src/main/java/javier/casal/autores.xml");

            XMLOutputFactory factory = XMLOutputFactory.newInstance();

            XMLStreamWriter writer = factory.createXMLStreamWriter(fichero);

            // Declaración XML
            writer.writeStartDocument("1.0");

            // <autores>
            writer.writeStartElement("autores");

            // <autor codigo="a1">
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", "a1");

            // <nome>Alexandre Dumas</nome>
            writer.writeStartElement("nome");
            writer.writeCharacters("Alexandre Dumas");
            writer.writeEndElement();

            // <titulo>El conde de montecristo</titulo>
            writer.writeStartElement("titulo");
            writer.writeCharacters("El conde de montecristo");
            writer.writeEndElement();

            // <titulo>Los miserables</titulo>
            writer.writeStartElement("titulo");
            writer.writeCharacters("Los miserables");
            writer.writeEndElement();

            // </autor>
            writer.writeEndElement();


            // <autor codigo="a2">
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", "a2");

            // <nome>Fiodor Dostoyevski</nome>
            writer.writeStartElement("nome");
            writer.writeCharacters("Fiodor Dostoyevski");
            writer.writeEndElement();

            // <titulo>El idiota</titulo>
            writer.writeStartElement("titulo");
            writer.writeCharacters("El idiota");
            writer.writeEndElement();

            // <titulo>Noches blancas</titulo>
            writer.writeStartElement("titulo");
            writer.writeCharacters("Noches blancas");
            writer.writeEndElement();

            // </autor>
            writer.writeEndElement();

            // </autores>
            writer.writeEndElement();

            // Finalizar documento
            writer.writeEndDocument();

            writer.close();
            fichero.close();

            System.out.println("Archivo autores.xml creado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al crear el archivo XML.");

        }
    }
}