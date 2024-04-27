package javaArray;

import java.util.Arrays;

public class SingleDimensionArray5 {
	
	public int smallestNumber(int[] arrInt1) {
		int smallestNum = arrInt1[0];
//		System.out.println(Arrays.toString(arrInt1));
		for (int i = 1; i < arrInt1.length; i++) {
			if (smallestNum > arrInt1[i]) {
				smallestNum = arrInt1[i];
			}
		}
		System.out.println("smallest numvber is : " + smallestNum);
		return smallestNum;
	}
	
	public int largestNumber(int arrInt1[]) {
		int largestNum = arrInt1[0];
		System.out.println(Arrays.toString(arrInt1));
		for (int i = 1; i < arrInt1.length; i++) {
			if (largestNum < arrInt1[i]) {
				largestNum = arrInt1[i];
			}
		}
		System.out.println("Largest number is : " + largestNum);
		return largestNum;
	}
	
	public void arraySortAscending(int[] arrInt1) {
		for (int i = 0; i < arrInt1.length; i++) {
			for (int j = i + 1; j < arrInt1.length; j++) {
				if (arrInt1[i] > arrInt1[j]) {
					arrInt1[i] = arrInt1[i] + arrInt1[j];
					arrInt1[j] = arrInt1[i] - arrInt1[j];
					arrInt1[i] = arrInt1[i] - arrInt1[j];
				}
			}
		}
		System.out.println("Ascending order sorted array : " + Arrays.toString(arrInt1));
	}
	
//	{ 9, 1, 8, 2, 7, 3, 6, 4, 5 }; 9 > 1 --> true
//	{ 1, 9, 8, 2, 7, 3, 6, 4, 5 }; 1 > 8 --> false.....
	
//	{ 1, 9, 8, 2, 7, 3, 6, 4, 5 }; 9 > 8 --> true
//	{ 1, 8, 9, 2, 7, 3, 6, 4, 5 }; 8 > 2 --> true
//	{ 1, 2, 9, 8, 7, 3, 6, 4, 5 }; 2 > 7 --> false.....
	
	public void arraySortDescending(int[] arrInt1) {
		for (int i = 0; i < arrInt1.length; i++) {
			for (int j = i + 1; j < arrInt1.length; j++) {
				if (arrInt1[i] < arrInt1[j]) {
					arrInt1[i] = arrInt1[i] + arrInt1[j];
					arrInt1[j] = arrInt1[i] - arrInt1[j];
					arrInt1[i] = arrInt1[i] - arrInt1[j];
				}
			}
		}
		System.out.println("Descending order sorted array : " + Arrays.toString(arrInt1));
	}

	public static void main(String[] args) {
//		int[] arrInt = { 7, 2, 4, 3, 1, 5, 2, 8 };
		int[] arrInt = { 7, 2, 4, 3, -4, 5, 2, 8 };
		
		SingleDimensionArray5 obj = new SingleDimensionArray5();
		obj.smallestNumber(arrInt);
		obj.largestNumber(arrInt);
		
		int[] arrInt2 = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		obj.smallestNumber(arrInt2);
		obj.largestNumber(arrInt2);
		
        obj.arraySortAscending(arrInt2);
        
        obj.arraySortDescending(arrInt2);
	}
}
