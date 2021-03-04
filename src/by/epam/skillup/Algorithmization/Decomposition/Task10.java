package by.epam.skillup.Algorithmization.Decomposition;

import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {

		Task10 task10 = new Task10();
		String result = task10.numbersIntoArray(2123456789);
		System.out.println(result);
	}

	public String numbersIntoArray(int n) {
		int[] arr = new int[10];

		while (n != 0) {
			for (int i = 0; i < arr.length; i++) {
				int z = n % 10;
				n = n / 10;
				arr[i] = z;
			}
		}
		String result = Arrays.toString(arr);
		
		return result;
	}
}
