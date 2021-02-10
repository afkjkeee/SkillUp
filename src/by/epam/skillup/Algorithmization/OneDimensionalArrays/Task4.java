package by.epam.skillup.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 9, 7, 8, 6 };

		Task4 task4 = new Task4();
		String result = task4.replaceMaxAndMin(arr);
		System.out.println(result);
	}

	public String replaceMaxAndMin(int[] arr) {
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			if (arr[i] < arr[min]) {
				min = i;
			}
		}

		int swap = arr[max];
		arr[max] = arr[min];
		arr[min] = swap;

		return Arrays.toString(arr);
	}
}
