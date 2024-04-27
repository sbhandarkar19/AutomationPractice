package oopsAbstraction;
// Program ==> A methods in this interface will be public & abstract by default.
//  1] If you create a protected method in an interface, java will not allow it.
//  2] Only public, private,abstract,default,static & strictfp are permitted(allowed).

public interface Laptop {
    public void developJavaProgram(); // Compiler write here default method ==> public abstract void developJavaProgram();
    
    void method1();                   // Compiler write here default method ==> public abstract void method1();
    
//  public, private, abstract, default, static & strictfp are permitted(allowed)
//  protected void method2();         // We cannot create protected method in interface
    
//  Since java 9, we can create private method inside the interface, but private method cannot be abstract method
    private void method3() {
    	
    }
    
    default int addition(int a, int b) {  // as we are using Java 11.
    	return a + b;
    }
    
    public static void main(String[] args) {
    	System.out.println("Inside the main() of interface");
     
    }
}
// In Java 8, we cannot protected as well as private methods
// Since Java 8, default & static methods are allowes in interface