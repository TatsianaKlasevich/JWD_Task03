package by.training.jwd.task3.main;

import java.io.File;

import by.training.jwd.task3.entity.Node;
import by.training.jwd.task3.service.XmlFileParserService;

public class Main {
	 public static void main( String[] args ){
	    	
	    	
	    	Node node = new Node();
	    	File file = new File("resource\\NewFile.xml");
	    	
	    	XmlFileParserService service = new XmlFileParserService();
	    	
	    	node = service.parserXML(file);
	    	
	    	PrintXmlFileInfo.print(node);
	    	

	    }
	}