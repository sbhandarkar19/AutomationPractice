package javaVariables;

public class VariablesPractice2 {

	public static void main(String[] args) {
//		here we will discuss about initializing the declared variable
		
//		let's first declare some variables
		int i;
		float f;
		double d;
		char ch;
		boolean flag;
		
		String str;
		
//		syntax for initializing the variables is ---> variablesName = value;
		
		i = 50;
		f = 98.22f;                //	[Float] by default java consider decimal number as double data type numbers
		                           //   to specify that value is of float data type we must write f in the end of the value

		d = 165.27;
		ch= 'J';                   //   The Chr value will always be written in Single Court [''].     ex-J,g,@ etc.  
		flag = true;
		str = "Java Program";    //   The String data will always be written in Double Court [""].   ex-" shubham ".
		
//		let's print the values of variables
        System.out.println(i);     //   TO print the value of variable,it is not necessary to write it in double court.
        System.out.println(f);     //   Write the name of the variable directly in bracket.
        System.out.println(d);
        System.out.println(ch);
        System.out.println(flag);
        System.out.println(str);
        
	}

}
