package cn.hongqiSVG;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

public class Hongqi {
    /**
     * 使用StAX绘制中国国旗的SVG文件
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            File file = new File("E:\\zh.svg");
            OutputStream out = Files.newOutputStream(file.toPath());
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = factory.createXMLStreamWriter(out);
            writer.writeStartDocument();
            writer.writeStartElement("svg");
            writer.writeAttribute("xmlns", "http://www.w3.org/2000/svg"); // svg
            writer.writeAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink"); // svg
            writer.writeAttribute("width", "900"); // svg
            writer.writeAttribute("height", "600"); // svg
            writer.writeAttribute("viewBox", "0 0 30 20"); // svg
            writer.writeStartElement("defs");
            writer.writeStartElement("path");
            writer.writeAttribute("id", "s"); // path
            writer.writeAttribute("d",
                    "M0,-1 0.587785,0.809017 -0.951057,-0.309017H0.951057L-0.587785,0.809017z");
            writer.writeAttribute("fill", "#ffde00"); // path
            writer.writeEndElement(); // End of path
            writer.writeEndElement(); // End of defs
            writer.writeStartElement("rect");
            writer.writeAttribute("width", "30"); // rect
            writer.writeAttribute("height", "20"); // rect
            writer.writeAttribute("fill", "#de2910"); // rect
            writer.writeEndElement(); // End of rect
            writer.writeStartElement("use");
            writer.writeAttribute("xlink:href", "#s"); // use1
            writer.writeAttribute("transform", "translate(5,5) scale(3)"); // use1
            writer.writeEndElement(); // End of use1
            writer.writeStartElement("use");
            writer.writeAttribute("xlink:href", "#s"); // use2
            writer.writeAttribute("transform",
                    "translate(10,2) rotate(23.036243)"); // use2
            writer.writeEndElement(); // End of use2
            writer.writeStartElement("use");
            writer.writeAttribute("xlink:href", "#s"); // use3
            writer.writeAttribute("transform",
                    "translate(12,4) rotate(45.869898)"); // use3
            writer.writeEndElement(); // End of use3
            writer.writeStartElement("use");
            writer.writeAttribute("xlink:href", "#s"); // use4
            writer.writeAttribute("transform",
                    "translate(12,7) rotate(69.945396)"); // use4
            writer.writeEndElement(); // End of use4
            writer.writeStartElement("use");
            writer.writeAttribute("xlink:href", "#s"); // use5
            writer.writeAttribute("transform",
                    "translate(10,9) rotate(20.659808)"); // use5
            writer.writeEndElement(); // End of use5
            writer.writeEndElement(); // End of svg
            writer.writeEndDocument();
            writer.close();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XMLStreamException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("END");
    }

}
