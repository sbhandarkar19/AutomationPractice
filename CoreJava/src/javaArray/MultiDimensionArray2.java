package javaArray;

public class MultiDimensionArray2 {

	public static void main(String[] args) {
//		Declare & initialize multi dimension array in a single statement
		double[][] arrDbl = { { 1.5, 2.5, 3.5 }, { 1.8, 2.8, 3.8 }, { 1.1, 2.1, 3.1 } };
		
		for (int i = 0; i < arrDbl.length; i++) {           //  1st for loop to iterate row
			for (int j = 0; j < arrDbl[i].length; j++) {    //  2nd for loop to iterate columns
				System.out.print(arrDbl[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arrInt = { { 11, 22, 33 }, { 12, 24 }, { 13, 26, 39, 42} };
		
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt[i].length; j++) {
				System.out.print(arrInt[i][j] + " ");
			}
			System.out.println();
		}

	}

}
