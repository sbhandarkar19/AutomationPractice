package javaAssigementProbem;

public class AdditionOfEvenNumbers {
//	Requirement ===> write a program to print addition of even numbers between 1 - 100

	public static void main(String[] args) {
		int i = 2, sum = 0;
		
		for (; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Addition of even numbers between 1 - 100 is " + sum);

	}

}
