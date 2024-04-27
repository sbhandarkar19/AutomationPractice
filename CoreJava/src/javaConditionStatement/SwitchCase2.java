package javaConditionStatement;

public class SwitchCase2 {
//	print the calculator problem

	public static void main(String[] args) {
		int a, b;
		char operator = '*';
		
		switch (operator) {
		case '+':
			a = 10;
			b = 20;
			System.out.println("Addition is : " + (a + b));
			break;
		case '-':
			a = 58;
			b = 40;
			System.out.println("Subtraction is : " + ( a - b));
			break;
		case '*':
			a = 6;
			b = 5;
			System.out.println("Multiplication is : " + ( a * b ));
			break;
		case '/':
			a = 100;
			b = 4;
			System.out.println("Division is : " + ( a / b));
			break;
		case '%':
			a = 100;
			b = 3;
			System.out.println("Reminder is : " + ( a % b));
			break;
		}
		
	}

}
