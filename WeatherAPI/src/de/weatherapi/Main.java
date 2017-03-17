package de.weatherapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) throws Exception {
		String uri = "http://api.openweathermap.org/data/2.5/forecast?q=Bonn&mode=xml&appid=381a845f689c1bcd27937961e5af5b67";
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(uri);
		
		NodeList times = document.getElementsByTagName("time");
		
		for (int x = 0; x < times.getLength(); x++) {
			Node time = times.item(x);
			NamedNodeMap timeAttributes = time.getAttributes();
			System.out.println(timeAttributes.getNamedItem("from"));
		}
		
	
	}

}
