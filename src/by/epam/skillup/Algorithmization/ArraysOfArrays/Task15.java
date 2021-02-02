package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task15 {
	public static void main(String[] args) {

		int[][] arr = { { 2, 17, 23, 6 }, 
						{ 3, 61, 34, 8 }, 
						{ 0, 13, 20, 4 } };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = max;
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
