package javaOperators;

public class UnaryOperator2 {
//	3] Unary Operator
//	Decrement Operator [1] Post-Increment [2] Pre-Increment

	public static void main(String[] args) {

//		a--;  // Post decrement ===> Before the use and after the decrement
//		--a;  // Pre decrement  ===> Before the decrement and after the use
		
//		a-- [ Post decrement ]
		
		int a = 8, i;
		
//		a = 8, 7, 6, 5                                    // a = after decrease the value
		i = a-- + a-- + a-- - a;  // 8 + 7 + 6 - 5        // a = before value use
		System.out.println("i = " + i + ", a = " + a);    // Console ==> i = 16, a = 5
		
		
//		--a [ Pre decrement ]
		a = 8;
		i = 0;
		
//		a = 8, 7, 6, 5, 4                                    // a = before value use
		i = --a + --a + a-- + a--;  // 7 + 6 + 6 + 5          // a = after decrease the value
		System.out.println("i = " + i + ", a = " + a);       // Console ==> i = 24, a = 4
	}

}
