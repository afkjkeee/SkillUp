package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task7 {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 12, 42, 33, 47 };

		Task7 task7 = new Task7();
		int result = task7.maxSumOfTwoNumbers(arr);
		System.out.println(result);
	}

	public int maxSumOfTwoNumbers(int[] arr) {
		int max = arr[0] + arr[arr.length - 1];

		for (int i = 1; i < arr.length / 2; i++) {
			if ((arr[i] + arr[arr.length - i - 1]) > max) {
				max = arr[i] + arr[arr.length - i - 1];
			}
		}

		return max;
	}
}
