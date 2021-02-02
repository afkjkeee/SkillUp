package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task3 {
	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, 0, 0, 6, 7, 8, 9, 10 };

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
		System.out.println("Отрицательных элементов в массиве: " + countNegative + ", положительных: " + countPositive
				+ ", равных нулю: " + countNeutral);
	}
}
