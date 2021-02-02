package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task5 {
	public static void main(String[] args) {

		int n = 4;

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				arr[i][j] = i + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
