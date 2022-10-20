/**
 * Demonstration of using HashMap on a User defined Class
 */

package hashMap;

import java.util.HashMap;
import java.util.Map;


public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Product> map = new HashMap<Person, Product>();
		
		map.put(new Person("lily","brown"), new Product(12,"Flowers",234.56));
		map.put(new Person("lily","brown"), new Product(12,"Books",234.56));
		map.put(new Person("rebecca","jessel"), new Product(12,"Life",234.56));
		
		System.out.println(map);
		
		for(Person P:map.keySet())
		{
			System.out.println(P);
		}
	}

}
