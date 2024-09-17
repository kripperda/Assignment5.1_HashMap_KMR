import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.*;

public class MapDictionary {
	
	private TreeMap<String,String> dictionary;//TreeMap kept sorted via Comparator
	
	public MapDictionary() {
		dictionary = new TreeMap<String,String>();		
	}//end constructor
	
	public void loadDictionary() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("DictionaryWordValuePairs.txt"));
		
		while(scan.hasNextLine()) {
			String data[] = scan.nextLine().split("\t");
			dictionary.put(data[0], data[1]);
		}//end while
		scan.close();
	}//close loadDictionary

	public String searchDictionary(String key) {
		return dictionary.get(key);
	}//end String searchDictionary
	
	public void printDictionary() {
		for(Map.Entry<String,String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue() );
		}
		
	}//end printDictionary
}//end class
