package javaOperators;

public class ContinueStatement {
//	Requirement==> Print capital alphabets from A to Z, skip alphabet k.

	public static void main(String[] args) {
		char ch = 'A';
		
		while (ch <= 'Z') {
			
			System.out.println(ch);
			ch++;
			
			if (ch == 'K') {
				ch++;
				continue;
			}
			
		}
		

	}

}
