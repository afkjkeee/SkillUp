package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task5 {
	public static void main(String[] args) {
		Task5 task5 = new Task5();
		String result = task5.squareMatrixByPattern(4);
		System.out.println(result);
	}

	public String squareMatrixByPattern(int n) {
		String result = "";
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				arr[i][j] = i + 1;
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
