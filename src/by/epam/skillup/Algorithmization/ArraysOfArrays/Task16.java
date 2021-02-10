package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task16 {
	public static void main(String[] args) {
		Task16 task16 = new Task16();
		String result = task16.magicSquare(3); // только для нечетных чисел
		System.out.println(result);
	}

	public String magicSquare(int n) {
		int[][] arr = new int[n][n];
		String result = "";

		int row = n - 1;
		int column = n / 2;
		arr[row][column] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (arr[(row + 1) % n][(column + 1) % n] == 0) {
				row = (row + 1) % n;
				column = (column + 1) % n;
			} else {
				row = (row - 1 + n) % n;
			}
			arr[row][column] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result = result + arr[i][j] + " ";
			}
			result += "\n";
		}

		return result;
	}
}