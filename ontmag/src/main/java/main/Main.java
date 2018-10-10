package main;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	//static final String TAG = "Main";

	public static void main(String[] args) {

        CSVParser csvParser = new CSVParser("last.csv");

		ArrayList<String> parseData = new ArrayList<>();
		try {
			parseData = csvParser.parse();
		} catch (IOException e) {
			e.printStackTrace();
        }
        
        System.out.println("Parsing done.");
        System.out.println(parseData);
        
        /*
		OntologyManager ontologyManager = new OntologyManager(parseData);
		ontologyManager.createModel("keyword.csv");
		Log.d(TAG, "String writing file");
		ontologyManager.printOnt("testOutput.owl");
		Log.d(TAG, "All Complete");
		*/
	}
}