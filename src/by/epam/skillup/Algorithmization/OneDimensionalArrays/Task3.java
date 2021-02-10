package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task3 {
	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, 0, 0, 6, 7, 8, 9, 10 };

		Task3 task3 = new Task3();
		String result = task3.countingNumbers(arr);
		System.out.println(result);
	}

	public String countingNumbers(int[] arr) {
		int countNegative = 0;
		int countPositive = 0;
		int countNeutral = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countNegative++;
			}
			if (arr[i] > 0) {
				countPositive++;
			}
			if (arr[i] == 0) {
				countNeutral++;
			}
		}

		return "Отрицательных элементов в массиве: " + countNegative + ", положительных: " + countPositive
				+ ", равных нулю: " + countNeutral;
	}
}
