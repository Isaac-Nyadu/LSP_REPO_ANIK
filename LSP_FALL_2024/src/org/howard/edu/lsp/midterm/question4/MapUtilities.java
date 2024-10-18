package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
* Provides utility methods for working with Hash maps.
*/
public class MapUtilities {

/**
* Returns the number of common key/value pairs between two HashMaps
* instances. Returns 0 if either or both maps are empty.
*
* @param map1 the first map
* @param map2 the second map
* @return the number of common key/value pairs
*/
public static int commonKeyValuePairs(
   HashMap<String, String> map1, HashMap<String, String> map2) {

 if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
   return 0;
 }

 int count = 0;
 for (String key : map1.keySet()) {
   if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
     count++;
   }
 }
 return count;
}
}
