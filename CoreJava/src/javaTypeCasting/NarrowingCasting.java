package javaTypeCasting;
// Type casting process that convert a data type into another data type in both ways manually(explicit) & automatically(implicit).
// implicit conversion means the compiler does it.
// explicit conversion means the programmer does it.
// Casting Two Type ==> 1] Primitive Casting
//                      2] Derived / Non-Primitive Casting.

// Primitive Casting Two type ==> 1] Narrowing Casting
//                                2] Widening Casting

// Program ==> Narrowing Type Casting.[converting higher data type into lower data type.]
// There is a possibility of data loss in Narrowing.

public class NarrowingCasting {

	public static void main(String[] args) {
//		narrowing type casting ==> converting higher data type into lower data type
//		has to be done manually, implicit conversion is not possible
		
		double d = 130.48;
		System.out.println("double : " + d);
		
//		casting variable d into float
		float f = (float) d;
		System.out.println("float : " + f);
		
//		casting variable f & d into long
		long ld = (long) d;
		long lf = (long) f;
		System.out.println("long to double : " + ld);  // 130 it means we lost some data as 0.48
		System.out.println("long to float : " + lf);
		
//		casting variable d, f & ld into int
		int iD = (int) d;
		int iF = (int) f;
		int iL = (int) ld;
		
		System.out.println("double to int : " + iD);
		System.out.println("float to int : " + iF);
		System.out.println("long to int : " + iL);
		
//		casting variable d, iL into byte
		byte b = (byte) d;
		System.out.println("double to byte : " + b);
		byte b1 = (byte) -135;
		System.out.println(b1);
	}
}
