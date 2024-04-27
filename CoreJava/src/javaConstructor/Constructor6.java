package javaConstructor;

public class Constructor6 {
//	Constructor does not return anything, But we can write return keyword. return value does not in write.
//	If the return type,return statement is specified in constructor then it will become Method.
	
	public Constructor6(int a) {  // access specifier is public
		
	}
	
    protected Constructor6(int a, int b) {  // access specifier is protected
		
	}
    
    private Constructor6(boolean flag) {  // access specifier is private
		
	}
    
    Constructor6() {           // access specifier is default
		return;                // we can write return keyword, but do not write return value.
//		System.out.println();  // Unreachable code
	}
    
    int Constructor6() {       // As we specified the Return Type & Return Statement, it becomes a Method
    	System.out.println("*******");
    	return 20;
    }

	public static void main(String[] args) {
		Constructor6 obj = new Constructor6();
	}

}
