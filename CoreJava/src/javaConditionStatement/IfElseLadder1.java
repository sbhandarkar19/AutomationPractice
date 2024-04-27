package javaConditionStatement;

public class IfElseLadder1 {
//	2)If Else Statement type [[A] If Else Ladder]
//	Requirement ==> Check the student marks and accordingly present the result as per the following data
//	                if (marks < 35)       ==> print fail
//	                if (35 <= marks < 55) ==> print pass class
//                  if (55 <= marks < 65) ==> print second class
//	                if (65 <= marks < 75) ==> print first class
//	                if (marks > 75)       ==> print distinction
	
	
	public static void main(String[] args) {
		int marks = 30;
		
		if (marks < 35) {
			System.out.println("You are Failed");
		} else if (marks < 55) {
			System.out.println("You are passed with Pass class");
		} else if (marks < 65) {
			System.out.println("You are passed with Second class");
		} else if (marks < 75) {
			System.out.println("You are passed with First class");
		} else {
			System.out.println("You are passed with Distinction");
		}

	}

}
