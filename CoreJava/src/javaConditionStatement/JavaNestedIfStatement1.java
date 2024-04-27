package javaConditionStatement;

public class JavaNestedIfStatement1 {
//	1] If statement type ( [A]Nested If Statement)
//	Requirement ==> [Check if the age of the person is greater han or equal to 18 and less than or equal to 65,
//	                then print that person is eligible for vaccination.]
//	this problem is [person is eligible only it is printing]

	public static void main(String[] args) {
		int age = 55;
		
		if (age  >= 18) {
			if (age <= 65) {
				System.out.println("You are eligible for vaccination");
			}
		}
		
	
	}

}
