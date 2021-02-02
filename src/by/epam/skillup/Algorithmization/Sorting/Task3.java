package by.epam.skillup.Algorithmization.Sorting;

public class Task3 {
	public static void main(String[] args) {

		int[] arr = { 7, 2, 16, 33, 47, 59, 13 };

		for (int i = 0; i < arr.length; i++) {
			int minValue = arr[i];
			int minId = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minId = j;
				}
			}

			int swap = arr[i];
			arr[i] = minValue;
			arr[minId] = swap;
		}
		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
	}
}
