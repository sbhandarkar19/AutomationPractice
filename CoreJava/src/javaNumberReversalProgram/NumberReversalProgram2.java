package javaNumberReversalProgram;

public class NumberReversalProgram2 {
//	123456789 is given number reverse this tp get the output as 987654321.
//	We don't know the Step Number, but if we know the Condition,then we will do it using [While Loop]

	public static void main(String[] args) {
		int i = 123456789;
		int rem = 0, revNum = 0;
		
		while( i != 0) {
			rem = i % 10;                     // Calculate the reminder(%) value
			revNum = revNum * 10 + rem;       // Calculate the reversal number value
			i = i / 10;                       // 12,13,14 line repeated
		}
		
		System.out.println("Reverse number is : " + revNum);     

	}

}
