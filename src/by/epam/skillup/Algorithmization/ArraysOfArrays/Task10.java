package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task10 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 17, 23 }, { 3, -61, 34 }, { 0, 13, 20 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i == j) && arr[i][j] > 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
