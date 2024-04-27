package javaArray;
// 2] MultiDimension / Two Dimension Array

public class MultiDimensionArray1 {

	public static void main(String[] args) {
//		in multi dimension array rows will be multiples & more than 1 & columns can any number
//		1] Syntax to: declare multi dimension array
//		dataType[][] arrayName; (or) dataType [][]arrayName; (or) dataType arrayName[][]; (or) dataType[] arrayName[];
		
		int[][] arrInt;     // primitive data type
		String[][] arrStr;  // Non-primitive data type
		
//		2] instantiation or memory allocation
//		Syntax:
//		arrayName = new dataType[no of rows][no of column];
		
		arrInt = new int[3][4];    // rows = 3 & columns = 4  // last row index = 3 - 1 = 2 & last column index = 4 - 1 = 3
		arrStr = new String[4][1]; // rows = 4 & columns = 1  // last row index = 4 - 1 = 3 & last column index = 1 - 1 = 0
		
//		3] Initialization
//      arrInt[row][column] = value;
		
		arrInt[0][0] = 1;
		arrInt[0][1] = 2;
		arrInt[0][2] = 3;
		arrInt[0][3] = 4;
		
		arrInt[1][0] = 4;
		arrInt[1][1] = 3;
		arrInt[1][2] = 2;
		arrInt[1][3] = 1;
		
		arrInt[2][0] = 1;
		arrInt[2][1] = 2;
		arrInt[2][2] = 3;
		arrInt[2][3] = 4;
		
//		arrStr[row][column] = value;
		arrStr[0][0] = "Java";
		arrStr[1][0] = "Phython";
		arrStr[2][0] = "Javascript";
		arrStr[3][0] = "C#";
		
		System.out.println("Number of rows in arrInt : " + arrInt.length);
		System.out.println("Number of columns in first row : " + arrInt[0].length);
		
		System.out.println("Number of rows in arrStr : " + arrStr.length);
		System.out.println("Number of columns in first row : " + arrStr[0].length);
		
		for (int i = 0; i < arrInt.length; i++) {          // 1st for loop to iterate over rows
			for (int j = 0; j < arrInt[i].length; j++) {   // 2ns for loop to iterate over columns
				System.out.print(arrInt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
