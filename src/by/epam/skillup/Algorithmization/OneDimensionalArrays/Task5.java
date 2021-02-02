package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task5 {
	public static void main(String[] args) {
		int k = 3;

		int[] array = { 16, 57, 13, 1, 26, 47, 93 };
		
		for (int i = 0; i < array.length; i++) {
			if (i > k) {
				System.out.println(array[i]);
			}
		}
	}
}
