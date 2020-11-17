/*
 Basic implementation of HashSet
 ->No duplicate elements
 ->internally, hash table data structure is used
 ->hashCode is used to differentiate between elements
 */

package hashSet;

import java.util.HashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//homogenous
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);
		numbers.add(5);
		numbers.add(0);
		System.out.println("Size of list"+numbers.size());
		//no duplicate elements
		//order is not maintained in case of strings
		//though, integers are arranged in ascending
		//to maintain order, use linked hash set
		

	}

}
