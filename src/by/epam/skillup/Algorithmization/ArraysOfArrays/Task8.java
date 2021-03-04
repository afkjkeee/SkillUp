package by.epam.skillup.Algorithmization.ArraysOfArrays;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 17, 23, 6 }, { 3, 61, 34, 8 }, { 0, 13, 20, 4 } };

		System.out.print("Âגוהטעו םמלונ ןונגמדמ סעמכבצא: ");
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt();

		System.out.print("Âגוהטעו םמלונ געמנמדמ סעמכבצא: ");
		int n = sr.nextInt();
		sr.close();

		Task8 task8 = new Task8();
		String result = task8.swappingColumns(arr, m, n);
		System.out.println(result);
	}

	public String swappingColumns(int[][] arr, int m, int n) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			int swap = arr[i][m - 1];
			arr[i][m - 1] = arr[i][n - 1];
			arr[i][n - 1] = swap;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result += arr[i][j] + " ";
			}
			result += "\n";
		}

		return result;
	}
}