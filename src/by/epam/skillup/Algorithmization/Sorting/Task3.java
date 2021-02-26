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
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
