package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Task2 task2 = new Task2();
		int result = task2.replaceNumbersThatAreGreaterThanZ(arr, 7);
		System.out.println(result);
	}

	public int replaceNumbersThatAreGreaterThanZ(int[] arr, int z) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}
		}

		return count;
	}
}
