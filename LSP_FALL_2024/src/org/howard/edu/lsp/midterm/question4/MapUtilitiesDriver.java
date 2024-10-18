package org.howard.edu.lsp.midterm.question4;

//MapUtilitiesDriver.java

import java.util.HashMap;

/**
* Testing MapUtilities Class.
*/
public class MapUtilitiesDriver {

/**
* The main method to execute the program.
*
* @param args command-line arguments
*/
	public static void main(String[] args) {
	
	 // Create map1 and add key-value pairs to it.
	 HashMap<String, String> map1 = new HashMap<>();
	 map1.put("Alice", "Healthy");
	 map1.put("Mary", "Ecstatic");
	 map1.put("Bob", "Happy");
	 map1.put("Chuck", "Fine");
	 map1.put("Felix", "Sick");
	
	 // Create map2 and add key-value pairs to it.
	 HashMap<String, String> map2 = new HashMap<>();
	 map2.put("Mary", "Ecstatic");
	 map2.put("Felix", "Healthy");
	 map2.put("Ricardo", "Superb");
	 map2.put("Tam", "Fine");
	 map2.put("Bob", "Happy");
	
	 // Output answer to stdout.
	 System.out.println(
	     "Number of common key/value pairs is: "
	         + MapUtilities.commonKeyValuePairs(map1, map2));
	}
}
