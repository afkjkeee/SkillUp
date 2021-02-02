package by.epam.skillup.Algorithmization.ArraysOfArrays;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		System.out.print("Âגוהטעו םמלונ ןונגמדמ סעמכבצא: ");
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt(); // m = 1

		System.out.print("Âגוהטעו םמלונ געמנמדמ סעמכבצא: ");
		int n = sr.nextInt(); // n = 4
		sr.close();

		int[][] arr = { { 1, 17, 23, 6 }, { 3, 61, 34, 8 }, { 0, 13, 20, 4 } };

		for (int i = 0; i < arr.length; i++) {
			int swap = arr[i][m - 1];
			arr[i][m - 1] = arr[i][n - 1];
			arr[i][n - 1] = swap;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
