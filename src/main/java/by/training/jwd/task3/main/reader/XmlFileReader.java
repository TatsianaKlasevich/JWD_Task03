package by.training.jwd.task3.main.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlFileReader {
	private File file;

	public XmlFileReader(String path) {
		this.file = new File(path);
	}

	public XmlFileReader(File file) {
		this.file = file;
	}

	public List<String> readFileInList() {

		List<String> list = new ArrayList<String>();

		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			while ((line = br.readLine()) != null) {

				list.add(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}
}
