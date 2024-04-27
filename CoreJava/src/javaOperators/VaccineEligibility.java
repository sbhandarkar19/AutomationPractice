package javaOperators;

public class VaccineEligibility {
//	&& ===> Operator use in this program
//	1) If you want both the conditions then use AND logical operator
//	2) If you want one of the two conditions then use OR logical operator.
//	Requirement ==> Vaccine Eligibility
//	                18 <= age <= 65 ===> eligible for vaccination
//	IMP NOTE : If any block such as if, else, for, while has only one statement in it,then we can omit/remove {} curly bracket.
//	         1] If it is a single statement then the curly brackets {} can be Omit/Remove.[ if, else, for, while].
//	         2] If it is Not a single statement then you cannot Omit/Remove {} the curly brackets.[ if, else, for, while].
	

	public static void main(String[] args) {
		int age = 25;
		
		if (age >= 18 && age <= 65)
			System.out.println("You are eligible for vaccination");
		else {
			System.out.println("You are not eligible for vaccination");
			System.out.println("Please wait for some time, vaccine for your age group is under trial");
		}
	}

}
