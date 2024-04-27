package javaConditionStatement;

public class JavaNestedIfStatement2 {
//	1) If statement type ([A] Nested If Statement)
//	Requirement ==> [Check if the age of the person is greater han or equal to 18 and less than or equal to 65,
//	                then print that person is eligible for vaccination.]
//	this problem same as [JavaNestedIfStatement1] Both are printing whether it is eligible or not. current problem
	
	public static void main(String[] args) {
		int age = 70;                         // only variable value change ,then different condition run.
		
		if (age >= 18) {
			if (age <= 65) {
				System.out.println("You are eligible for vaccination");
			}
			if (age > 65) {
				System.out.println("You are not eligible for vaccination as you are more than 65");
			}
		}
		    if (age < 18) {
		    	System.out.println("You are not eligible for vaccination as you are less than 18");
		    }
		
	}

}
