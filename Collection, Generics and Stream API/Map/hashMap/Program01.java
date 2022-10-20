/**
 Program to demonstrate the basic use of HashMap
 using objects with inbuilt natural ordering like primary data types
 or Strings.
 */

/**
 -> HashMaps are most commonly used implementation of Maps
 -> They are key value pairs where no two same key is allowed.
 -> Order of insertion is not maintained.
 */
package hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bellatrix
 *
 */
public class Program01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap implements Map interface
		Map<String, String> map = new HashMap<String, String>();
		
		//adding elements
		map.put("One", "Flower");
		map.put("One", "Book");
		map.put("two", "wood");
		map.put("three", "pencil");
		map.put("four", "cubes");
		
		//keys are arranged in random order(dependent on internal hash code)
		//If we try to add same key, the old key content is replaced by the new value
		System.out.println(map);
		
	
		//to seperate key and values
		for(Map.Entry entry: map.entrySet())
		{
			String value = (String) entry.getValue();
			System.out.println(value);
			
		}
		
		

	}

}
