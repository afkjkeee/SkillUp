package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task2 {
	public static void main(String[] args) {
		int[] a = { 1, 17, 23 };
		int[] b = { 3, 61, 34 };
		int[] c = { 0, 13, 20 };
		int[][] arr = { a, b, c };

		Task2 task2 = new Task2();
		String result = task2.matrixElementsDiagonally(arr);
		System.out.println(result);
	}

	public String matrixElementsDiagonally(int[][] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					result = result + arr[i][j] + " ";
				}
			}
			result += "\n";
		}

		return result;
	}
}