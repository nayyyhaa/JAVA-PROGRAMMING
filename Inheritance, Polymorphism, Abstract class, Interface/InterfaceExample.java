/*

If a class that implements an interface does not define all the
methods of the interface, then it must be declared abstract snd
the method definitions must be provided by the concrete subclass 
that extends the abstract class. 

*/

//interface
interface Grandparent {
    int x = 100;
    void disp(); //abstract method 1
    void show(); //abstract method 2
}

//abstract class
abstract class Parent implements Grandparent {
    abstract public void disp(); //abstract method 1
}

//concrete class
class Child extends Parent {

    public void disp() { 
        System.out.println("concrete class");
    }

    public void show() {
        System.out.println("x = " + x);
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        Grandparent g = new Child();
        g.disp();
        g.show();
    }
}
