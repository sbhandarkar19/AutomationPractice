package javaTypeCasting;
// Program ==> 2] Widening Casting ==> Convert lower data type into higher data type.
// There is a not possibility of data loss in Widening.

public class WideningCasting {

	public static void main(String[] args) {
//		Widening Casting ==> it is process of converting lower data type into higher data type
//		it can be implicitly(Automatically compiler) & explicitly(Manually programmer).
		
		byte b = 125;
		System.out.println("byte b = " + b);
		
		short s = b; // auto-widening or type-casting (implicitly)
		System.out.println("short s = " + s);
		
		long l = s;           // implicitly
		long l1 = (long) s;   // explicitly
		System.out.println("long l = " + l);
		System.out.println("long l1 = " + l1);
		
		double d = l;
		System.out.println("double d = " + d);
		

	}

}
