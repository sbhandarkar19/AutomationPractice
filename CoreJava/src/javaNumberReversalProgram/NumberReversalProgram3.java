package javaNumberReversalProgram;

public class NumberReversalProgram3 {
//	Same as program only created the 1) method
//	program==> Create a method to check reverse numbers.
	
	public static int numberReversal(int i) {
		int rem = 0, revNum = 0;
		
		while (i != 0) {
			rem = i % 10;
			revNum = revNum * 10 + rem;
			i = i / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		int revNum = NumberReversalProgram3.numberReversal(1085497);
		System.out.println(revNum);
		
		System.out.println(NumberReversalProgram3.numberReversal(581)); // call for println statement,because they are making some return
		System.out.println(NumberReversalProgram3.numberReversal(8316));
		System.out.println(NumberReversalProgram3.numberReversal(19));
	}

}
