package by.epam.skillup.Algorithmization.Sorting;

public class Task3 {
	public static void main(String[] args) {

		int[] arr = { 7, 2, 16, 33, 47, 59, 13 };
		Task3 task3 = new Task3();
		task3.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] arr) {
		boolean isSorted;
		for (int i = 0; i < arr.length - 1; i++) {
			isSorted = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					isSorted = false;
				}
			}
			if (isSorted)
				return;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
