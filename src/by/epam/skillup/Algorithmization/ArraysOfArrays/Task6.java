package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task6 {
	public static void main(String[] args) {
		Task6 task6 = new Task6();
		String result = task6.squareMatrixByPattern(4);
		System.out.println(result);
	}

	public String squareMatrixByPattern(int n) {
		String result = "";
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i; j++) {
				arr[i][j] = 1;
				arr[n - i - 1][j] = 1;
			}
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