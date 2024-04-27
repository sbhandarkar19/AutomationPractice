package javaArray;
// Two type of Array ==> 1] Single Dimension Array
//                         2] Multidimension / Two dimensional  Array
// How to print the array element :
//   1] using for loop
//   2] using for-each loop
//   3] using Arrays class

public class SingleDimensionArray1 {

	public static void main(String[] args) {
//		1] Syntax to ==> declare array
		
//		data_type[] arrayName;
//		data_type []arrayName;
//		data_type arrayName[];
		
		int[] arrInt;      // primitive data type
		char []arrChar;    // primitive data type
		String arrStr[];   // Non-primitive data type
		
//		2] how to instantiate or allocate memory to declared array
//		Syntax:
//		arrayName = new data_type[int size];
		
		arrInt = new int[5];      // it can store maximum of 5 integer values, last index will be ( 5 - 1 ) = 4
		arrChar = new char[52];   // its size will be fixes now, size cannot be changed once declared
		arrStr = new String[11];  // size = 11 & last index = (Size - 1) = (11-1) = 10
		
//		3] declaring & instantiating array in single line
		double[] arrDbl = new double[8];
		
//		4] how to assign values to array
//		Syntax:
//		arrayName[index] = value;  // remember indexing will starts from zero
		
		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
//		arrInt[5] = 6;  // ArrayIndexOutOfBoundsException
		
//		6] how to get the size of array
		int arrIntSize = arrInt.length;
		System.out.println("Int Array Size : " + arrIntSize);
		
		System.out.println("Char Array Size : " + arrChar.length);
		System.out.println("String Array Size : " + arrStr.length);
		
//		5] how to print the array element
//		1.using for loop
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arrInt[i]);
		}
		
//		2.using for-each loop
//		Syntax:
//		for (array_Data_type variable : arrayName) {
//			variable
//		}
		
		System.out.println("*****for-each loop*****");
		for (int a : arrInt) {
			System.out.println(a);
		}

	}

}
