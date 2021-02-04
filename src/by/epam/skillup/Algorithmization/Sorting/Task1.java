package by.epam.skillup.Algorithmization.Sorting;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		int[] arrayOne = { 7, 2, 16, 33, 47, 59, 16 };
		int[] arrayTwo = { 36, 11, 5, 87 };
		int k = 4;
		Task1 task1 = new Task1();
		task1.insertArray(arrayOne, arrayTwo, k);
	}

	public void insertArray(int[] firstArray, int[] secondArray, int insertPosition) {
		int arrayTwoCount = 0;
		int arrayOneCount = insertPosition;

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < insertPosition; i++) {
			arr.add(i, firstArray[i]);
		}
		for (int i = insertPosition; i < secondArray.length + insertPosition; i++) {
			arr.add(i, secondArray[arrayTwoCount]);
			arrayTwoCount++;
		}
		for (int i = insertPosition + secondArray.length; i < firstArray.length + secondArray.length; i++) {
			arr.add(i, firstArray[arrayOneCount]);
			arrayOneCount++;
		}
		for (Integer a : arr) {
			System.out.print(a + " ");
		}
	}
}
