package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task3 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 23, 17, 23 }, { 9, 6, 34, 77, 12 }, { 0, 1, 20, 64, 31 } };

		int k = 1;
		int p = 3;

		System.out.print(k + "-я строка матрицы: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == k) {
					System.out.print(arr[k][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println(p + "-й столбец матрицы: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == p) {
					System.out.print(arr[i][p] + " ");
				}
			}
			System.out.println();
		}
	}
}
