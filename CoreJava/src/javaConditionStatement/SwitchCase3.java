package javaConditionStatement;

public class SwitchCase3 {
//	one method add in this program
//	this are three argument add
	
	
	public static void calculator(char operator, int a, int b) {
		switch (operator) {
		case '+':
			System.out.println("Addition is : " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction is : " + ( a - b));
			break;
		case '*':
			System.out.println("Multiplication is : " + ( a * b ));
			break;
		case '/':
			System.out.println("Division is : " + ( a / b));
			break;
		case '%':
			System.out.println("Reminder is : " + ( a % b));
			break;
			}
	}

	public static void main(String[] args) {
//		this global variable are Static Method then call from Class Name through
		
		SwitchCase3.calculator('*', 10, 20);
		SwitchCase3.calculator('+', 2, 42);
		SwitchCase3.calculator('-', 40, 13);
        SwitchCase3.calculator('/', 64, 8);
        SwitchCase3.calculator('%', 25, 4);
        
	}

}
