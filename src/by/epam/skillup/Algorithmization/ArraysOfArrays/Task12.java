package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task12 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 17, 23, 6 }, 
						{ 3, 61, 34, 8 }, 
						{ 0, 13, 20, 4 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] > arr[i][k]) {
						int b = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = b;
					}
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] < arr[i][k]) {
						int b = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = b;
					}
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
