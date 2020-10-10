// Stack implementation using exception handling to manage underflow and overflow conditions in java by Chinmay

class StackException extends Exception { // Exception class

    StackException( String message)
    {
    super(message);
    }
}

class ArrayStack { // Main class
    public static int[] item;
    public static int stackTop;

    ArrayStack( )
    {
        item = new int[4];
        stackTop=-1;
    }

    static void push(int x) throws StackException { // Push method of stack determining overflow condition
        if (stackTop==item.length-1) {
            throw new StackException("Stack overflow");
        }
        stackTop++;
        item[stackTop] = x;
    }

    static void pop( ) throws StackException { // Pop method of stack determining underflow condition
        int returnItem;
        if ( stackTop==-1) {
            throw new StackException("Stack underflow");
        }
        returnItem = item[stackTop--];
        System.out.println(returnItem);
    }
}

class Demo { // Driver code
public static void main( String args[] ) {

    ArrayStack s=new ArrayStack();
    try
    {
        for(int i=0;i<4;i++)
            s.push(i);
        for(int j=0;j<5;j++)
            s.pop();
    }

    catch ( StackException e ) {
        System.out.println("Error detected: " + e.getMessage() );
    }
}
}

/* Output:
            3
            2
            1
            0
            Error Detected: Stack underflow */