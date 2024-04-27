package javaConditionStatement;

public class LeapYear1 {
//	&& ---> Condition/Operator use.
//	Requirement ===> Will the calendar tell whether it is a Leap Year or Not
//	Rule ===> 1] Divide year by 100 and check whether the Reminder (%) is zero or not.
//	          2] If year's last two digits are Non-Zero, divide year by 4 if reminder is zero then given year is leap year.
//	          3] If year's last two digits are Zero, divide year by 400 if reminder is zero then given year is leap year.
//	EX ==> 1700 [ Ordinary year ] , 2000/2004 [ Leap year]
	
//	Extra  ==> 1] If you get reminder zero in both 100 and 400 then it is Leap Year.
//	           2] If you don't get zero reminder in 100 and 400 then it is Ordinary Year.
//	           3] If you get reminder zero in both 100 and 4 then it is Leap Year.
//	           4] If you don't get zero reminder in 100 and 4 then it is Ordinary Year.v

	public static void main(String[] args) {
		int year = 2000;
		
		if ( (year % 100) == 0 && (year % 400) == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}

//  && [logical AND] ---> if you want both the condition then use { AND Operator }.

//true && true   ==> true
//false && true  ==> false
//true && false  ==> false
//false && false ==> false
