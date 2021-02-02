package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task13 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 17, 23, 6 }, 
						{ 3, 61, 34, 8 }, 
						{ 0, 13, 20, 4 } };

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {

				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i][j] > arr[k][j]) {
						int b = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = b;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {

				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i][j] < arr[k][j]) {
						int b = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = b;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
