/*
 * implementation of hashSet using user defined classes
 */

package hashSet;

import java.util.HashSet;
import java.util.Set;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Product> products = new HashSet<Product>();
		products.add(new Product(1, "biscuits", 123));
		products.add(new Product(2, "biscuits", 123));
		products.add(new Product(1, "milk", 123));
		products.add(new Product(1, "biscuits", 123)); 
		//generate hash code/equals method for user defined class to detect same object
		
		System.out.println(products.size());
		for(Product p:products)
		{
			System.out.println(p.hashCode());
		}
		

	}

}
