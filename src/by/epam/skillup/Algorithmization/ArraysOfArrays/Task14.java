package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task14 {
	public static void main(String[] args) {

		int m = 7;
		int n = 5;

		int[][] arr = new int[m][n];

		if (m < n) {
			System.out.println("¬ысота матрицы должна быть больше ее ширины.");
		} else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (i <= j) {
						arr[i][j] = 1;
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}