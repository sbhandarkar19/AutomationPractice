package javaOperators;

public class UnaryOperator1 {
//	3] Unary Operator
//	Increment Operator [1] Post-Increment [2] Pre-Increment

	public static void main(String[] args) {
//		a++;  // Post increment ===> Before the use and after the increment
//		++a;  // Pre increment  ===> Before the increment and after the use
		
//		a++ [ Post increment ]
		
		int a = 15, i;

//		a = 1, 2, 3, 4                                     // a = after increase the value
		i = a++ + a++ + a + a++; // 1 + 2 + 3 + 3          // a = before value use
		System.out.println("i = " + i + ", a = " + a);     // console ==> i = 9, a = 4

		i = 0;
		a = 1;

//		a = 1, 2, 3, 4
		i = a++ + a + a++ + a + a++; // 1 + 2 + 2 + 3 + 3
		System.out.println("i = " + i + ", a = " + a);        // i = 11, a = 4

		i = 0;
		a = 1;

//		a = 1, 2, 3, 4, 5
		i = a + a + a++ + a++ + a++ + a++ + a; // 1 + 1 + 1 + 2 + 3 + 4 + 5
		System.out.println("i = " + i + ", a = " + a);        //  i = 17, a = 5
		
		
//     ++a [ Pre increment ]
		
		i = 0;                               
		a = 1;
		
//		a = 1, 2, 3, 4                                     // a = before value use
		i = ++a + ++a + a + ++a;  //2 + 3 + 3 + 4          // a = after increase the value
		System.out.println("i = " + i + ", a = " + a );    // Console ==> i = 12, a = 4
		
		i = 0;
		a = 1;
		
//		a = 1, 2, 3, 4, 5, 6
		i = ++a + a++ + ++a + a++ + ++a;  // 2 + 2 + 4 + 4 + 6
		System.out.println("i = " + i + ", a = " + a);    // i = 18, a = 6
		
	}

}
