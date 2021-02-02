package by.epam.skillup.Algorithmization.Decomposition;

public class Task5 {
	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 9, 7, 8, 6 };

		int max = 0;
		int preMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				preMax = max;
				max = arr[i];
			} else if (arr[i] > preMax) {
				preMax = arr[i];
			}
		}
		System.out.print(preMax + " ");
	}
}
