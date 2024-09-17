import java.io.FileNotFoundException;
/* Application to search and print dictionary searches 
 * from uploaded file
 */
public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		//search #1
		Dictionary d = new Dictionary();
		d.loadDictionary();
		
		System.out.print(d.searchDictionary("pate"));
		d.printDictionary();
		
		//search #2
		Dictionary d1 = new Dictionary();
		d1.loadDictionary();
		
		System.out.print(d1.searchDictionary("fandangle"));
		d1.printDictionary();
		
		//search #3
		Dictionary d2 = new Dictionary();
		d2.loadDictionary();
		
		System.out.print(d2.searchDictionary("potation"));
		d2.printDictionary();
		
		//search #4
		Dictionary d3 = new Dictionary();
		d3.loadDictionary();
		
		System.out.print(d3.searchDictionary("condition"));
		d3.printDictionary();
		
		//search #5
		Dictionary d4 = new Dictionary();
		d4.loadDictionary();
				
		System.out.print(d4.searchDictionary("behoof"));
		d4.printDictionary();
		
		//map search
		MapDictionary d6 = new MapDictionary();
		d6.loadDictionary();
		
		d6.printDictionary();
		System.out.println(d2.searchDictionary("breech"));
		
		
	}//end main

}//end class
