package javaNumberReversalProgram;

public class NumberReversalProgram1 {

	public static void main(String[] args) {
//		I want to print the last number among the given numbers.
//		if we want the last digit of any number then divide it by 10.And get a reminder of that only last number. EX -- 89, 564, 8785,last digit get reminder		
		
		int i = 123456789;
		
		int rem = i % 10;          //  If you want the last number then make a reminder symbol (%) and divide by 10. EX -Before-123456789, After-9.
		
		System.out.println(rem);
		
		i = i / 10;                 //  If you want to remove the last digit,divide by 10. EX--Before-123456789, After-1234678.
		System.out.println(i);

	}

}
