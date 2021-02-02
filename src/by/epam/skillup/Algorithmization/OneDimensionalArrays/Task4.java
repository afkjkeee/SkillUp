package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task4 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 9, 7, 8, 6 };

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

		for (int i = 0; i < arr.length; i++)		
			System.out.print(arr[i] + " ");
	}
}
