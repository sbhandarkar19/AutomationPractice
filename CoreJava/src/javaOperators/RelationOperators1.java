package javaOperators;

public class RelationOperators1 {
//	1] Relation Operators

	public static void main(String[] args) {
		int a = 15, b = 20, c = 20;
         boolean flag;                     // result output save this boolean variable
         
         flag = b == c;
         System.out.println("b == c : " + flag);
         System.out.println("a != c : " + (a != c));
         
         System.out.println("a < b : " + (a < b));
         System.out.println("a <= b : " + (b <= c));
         
         System.out.println("a > b : " + (a > b));
         System.out.println("a >= b : " + (a >= b));
         
         char ch1 = 'a', ch2 = 'b';
//         Char data will be compared based on Ascii Values
         
         System.out.println("ch1 == ch2 : " + (ch1 == ch2));
         System.out.println("ch1 == ch2 : " + (ch1 == ch2));
         
         System.out.println("ch1 > ch2 : " + (ch1 > ch2));
         System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));
         
         System.out.println("ch1 < ch2 : " + (ch1 < ch2));
         System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));
         
         boolean b1 = false, b2 = true;
//         We can compare boolean values for (==) Equal to and (!=) Not-equal to than Relation operators 
         
         System.out.println("b1 == b2 : " + (b1 == b2));
         System.out.println("b1 != b2 : " + (b1 != b2));
         
//         System.out.println("b1 > b2 : " + (b1 > b2));
//         We cannot compare boolean values for (< , <=) Less than or (> , >=) Greater than Relations Operators
         
         String s1 = "Java", s2 = "Python";
//       We can compare String values for (==) Equal to and (!=) Not-equal to than Relation operators 
         
         System.out.println("s1 == s2 : " + (s1 == s2));
         System.out.println("s1 != s2 : " + (s1 != s2));
         
//       System.out.println("s1 > s2 : " + (s1 > s2));
//       We cannot compare String values for (< , <=) Less than or (> , >=) Greater than Relations Operators
         
	}      
                 
}      
            
       
         
         
	


