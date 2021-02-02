package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task1 {
	public static void main(String[] args) {
		int[] array = { 1, 7, 12, 22, 33, 47 };
		
		int k = 2;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum = sum + array[i];
			}
		}
		System.out.println(sum);
	}
}
