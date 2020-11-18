/**
 * This is an example of the singleton pattern.
 * A singleton makes sure that there is only 1 instance of a class. 
 * The example shows that we can call getInstance several times and will always get back the same object,
 * so s1, s2 and s3 are pointers to the same object. As a result the counter of invocations will be increased
 * for all of them with every invocation of singeltonMethod.
 */
public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		//Singleton s4 = new Singleton();  // this would not work since the constructor is not visible 
		
		s1.singletonMethod();
		s2.singletonMethod();
		s3.singletonMethod();
	}
}

class Singleton{
	private static Singleton instance = null;
	
	private int invocations;
	
	//make constructor private so no one can call it from outside the class 
	private Singleton() {
		invocations = 0;
	}
	
	//getInstance is the only way the get an Instance from the Singleton class and this is the point where
	//we make sure there is only 1 single instance.
	public static Singleton getInstance() {
		if (instance == null) {
			Singleton.instance = new Singleton();
		}
		return instance;
	}
	
	public void singletonMethod() {
		invocations++;
		System.out.println("SingletonMethod has been called " + invocations + " times.");
	}
}
