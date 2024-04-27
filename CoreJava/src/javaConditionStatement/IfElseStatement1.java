package javaConditionStatement;

public class IfElseStatement1 {
//	2] If Else Statement (First Program)
//	If a condition is true or false,then it will be given an [IfElse Statement]
//	Requirement ==>[If flight tickets are available then team will fly to manali,
//	               otherwise team will go to Lonavala.]
//	as per requirement Flight tickets are available or not, To tell whether true or false, Boolean variable will have to be taken.

	public static void main(String[] args) {
		boolean flightTicketsAvailable = true;
		
		if(flightTicketsAvailable) {                       // if ( ) bracket value include 1) variable name 2) condition statement(ex- >,<,<=,>=,...etc) 
			System.out.println("Team will fly to Manali");
		} else {
			System.out.println("Team will go to Lonavala");
		}
		
	}

}
