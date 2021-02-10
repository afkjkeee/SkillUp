package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task5 {
	public static void main(String[] args) {
		int[] array = { 16, 57, 13, 1, 26, 47, 93 };

		Task5 task5 = new Task5();
		String result = task5.printNumbersGreaterThanK(array, 3);
		System.out.println(result);
	}

	public String printNumbersGreaterThanK(int[] array, int k) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (i > k) {
				result = result + array[i] + " ";
			}
		}

		return result;
	}
}
