package java1;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLread {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("C:\\Users\\p.nvs.vivek\\Documents\\practice.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println("The root element of XML is "+doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("stock");
		System.out.println("nodeList size "+nodeList.getLength());
		for(int i=0; i<nodeList.getLength();i++)
		{
			Node node = nodeList.item(i);
			if(node.getNodeType()==node.ELEMENT_NODE)
			{
				Element ele = (Element) node;
				System.out.println("Stock symbol "+getValue("symbol",ele));
				System.out.println("Stock Price "+getValue("price",ele));
				System.out.println("Stock Quantity "+getValue("quantity",ele));
			}
		}
	}
	
	public static String getValue(String tag, Element element)
	{
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}
