package by.training.jwd.task3.service;

import java.io.File;

import by.training.jwd.task3.entity.Node;
import by.training.jwd.task3.main.parser.XmlFileParser;
import by.training.jwd.task3.main.reader.XmlFileReader;

public class XmlFileParserService {
public Node parserXML(File path) {
		
		
		
	XmlFileReader reader = new XmlFileReader(path);
	XmlFileParser parser = new XmlFileParser();
		
		Node node = new Node();
		
		node = parser.parser(reader.readFileInList());
		
		return node;
	}
}