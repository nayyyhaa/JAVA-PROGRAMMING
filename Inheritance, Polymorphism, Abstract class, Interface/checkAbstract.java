/* We can create abstract class without having any abstract method(s) and we can use the 
concrete method(s) from another class having main method 

As abstract class can't be instantiated so, here I have created normal class(named Concrete) 
which extends abstract class(named Abstract) so that I can create object of Concrete class in order to access method(s)

So, when we access concrete method with the help of class reference "ob" 
We will get the following  output:

Abstract Class

*/


abstract class Abstract{ //Abstract class
	void show() { //Concrete method
		System.out.println("Abstract class");
	}
}
class Concrete extends Abstract{ //Normal class
	
}

public class checkAbstract {

	public static void main(String[] args) {
		Concrete ob = new Concrete(); //Object of Concrete class
		ob.show();

	}
}
