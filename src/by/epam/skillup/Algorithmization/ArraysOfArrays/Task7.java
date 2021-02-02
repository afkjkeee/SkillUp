package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task7 {
	public static void main(String[] args) {

		int n = 3;
		int A1 = 2;
		int count = 0;

		double[][] arr = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = Math.sin((Math.pow(i, A1) - Math.pow(j, A1)) / n);
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Число положительных элементов в матрице: " + count);
	}
}
