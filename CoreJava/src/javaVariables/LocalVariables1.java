package javaVariables;

public class LocalVariables1 {

	public static void main(String[] args) {
		byte b;
//      System.out.println(b);          //  it is mandatory to initialize local variable before using it
        b = 15;                         //  here variable b has been initializes, now one can use it
        System.out.println(b);
        
        int x, y, addition;             // addition = x + y; we can use x & y since they are not initialized
        
        x = 10;
        y = 20;
        addition = x + y;
        System.out.println(addition);
        
//      it is mandatory to initializes local variable before using it  

	}

}
