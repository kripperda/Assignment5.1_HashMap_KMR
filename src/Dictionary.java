import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**Stores and manages list of archaic words and definitions */


public class Dictionary {
	
	private HashMap<Integer,String> dictionary;
	
	public Dictionary() {
		dictionary = new HashMap<Integer, String>();
	}//end constructor
	
	//Load dictionary file. Throws exception if file not found
	public void loadDictionary() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("DictionaryWordValuePairs.csv"));
		
		while(scan.hasNextLine()) {
			String data[] =  scan.nextLine().split("/t");
			dictionary.put(data[0].hashCode(), data[0]);
		}
		scan.close();
	}//end loadDictionary
	
	//Load search function of dictionary
	public String searchDictionary(String key) {
		return dictionary.get(key.hashCode());
	}//end searchDictionary

	//Print out entries from dictionary file
	public void printDictionary() {
		for(Map.Entry<Integer, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}//end for loop

	}	//end printDictionary
}//end class
