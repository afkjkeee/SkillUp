package by.epam.skillup.Algorithmization.Sorting;

public class Task4 {
	public static void main(String[] args) {
		int[] arr = { 7, 2, 16, 33, 47, 59, 13 };
		Task4 task4 = new Task4();
		task4.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (arr[j] < arr[j - 1])
					swap(arr, j, j - 1);
				else
					break;
			}
		}
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
