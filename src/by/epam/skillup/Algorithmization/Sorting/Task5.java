package by.epam.skillup.Algorithmization.Sorting;

public class Task5 {
	public static void main(String[] args) {
		int[] arr = { 7, 2, 16, 33, 47, 59, 13 };
		Task5 task5 = new Task5();
		task5.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] arr) {
		int h = 1;
		while (h * 3 < arr.length)
			h = h * 3 + 1;

		while (h >= 1) {
			hSort(arr, h);
			h = h / 3;
		}
	}

	private void hSort(int[] arr, int h) {
		for (int i = h; i < arr.length; i++) {
			for (int j = i; j >= h; j = j - h) {
				if (arr[j] < arr[j - h])
					swap(arr, j, j - h);
				else
					break;
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
