package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task5 {
	public static void main(String[] args) {
		int[] array = { 16, 1, 0, 1, 26, 47, 93 };

		Task5 task5 = new Task5();
		String result = task5.printNumbersGreaterThanK(array);
		System.out.println(result);
	}

	public String printNumbersGreaterThanK(int[] array) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				result = result + array[i] + " ";
			}
		}

		return result;
	}
}
