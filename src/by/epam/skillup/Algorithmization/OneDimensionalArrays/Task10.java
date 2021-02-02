package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task10 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 16, 7, 3, 8, 16, 3, 16, 16 };

		for (int i = 1; i < arr.length; i += 2) {
			arr[i] = 0;
		}
		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
	}
}
