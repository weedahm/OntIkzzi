package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class CSVParser {
	String csvFilePath;
	String line = "";
	String csvSplitBy = ",";
	
	CSVParser(String csvFilePath) {
		this.csvFilePath = csvFilePath;
	}
	
	public ArrayList<String> parse() throws IOException {

		URL filepath = getClass().getResource(csvFilePath);
		File file = new File(filepath.getPath());

		System.out.println("Parsing : " + file);

		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "MS949");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		ArrayList<String> result = new ArrayList<>();
		
		while ((line = bufferedReader.readLine()) != null) {
			result.add(line);
        }
		
		bufferedReader.close();
		
		return result;
	}
}