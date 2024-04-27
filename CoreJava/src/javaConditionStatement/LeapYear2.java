package javaConditionStatement;

public class LeapYear2 {
	
//	&& - || ===> Condition/Operator use.
//	||      ---> this use for checking two condition

	public static void main(String[] args) {
		int year = 2023;
		
		if(((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		
	}

}

//     && [logical AND] ---> if you want both the condition then use { AND Operator }.

//   true  && true   ==> true
//   false && true   ==> false
//   true  && false  ==> false
//   false && false  ==> false


//    || [logical OR]  ---> if you want one of the two condition then use { OR Operator}.
       
//    true  || true   ==> true
//    false || true   ==> true
//	  true  || false  ==> true	
//    false || false  ==> false

