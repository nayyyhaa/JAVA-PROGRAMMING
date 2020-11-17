package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List implements List interface
		List<String> list = new ArrayList<String>();
		
		//elements can be added by .add() method
		list.add("new striing");
		list.add("some");
		list.add("some");
		list.add(2, "the");
		
		//order of insertion is maintained
		System.out.println(list);
		
		// .contains() will check if element exists in the given list
		System.out.println(list.contains("some"));  //returns true
		
		//helps to return a sublist in the given index range
		List<String> sub = list.subList(1,3);
		System.out.println(sub);
		
		

	}

}
