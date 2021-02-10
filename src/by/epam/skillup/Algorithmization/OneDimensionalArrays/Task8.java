package by.epam.skillup.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

public class Task8 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 9, 3, 8, 6 };

		Task8 task8 = new Task8();
		String result = task8.arrayWithoutMinNumber(arr);
		System.out.println(result);
	}

	public String arrayWithoutMinNumber(int[] arr) {
		int min = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
				count++;
			}
		}

		int[] newArray = new int[arr.length - count];

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				newArray[k] = arr[i];
				k++;
			}
		}

		return Arrays.toString(newArray);
	}
}