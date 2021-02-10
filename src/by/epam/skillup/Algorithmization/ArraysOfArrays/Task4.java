package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task4 {
	public static void main(String[] args) {
		Task4 task4 = new Task4();
		String result = task4.squareMatrixByPattern(4);
		System.out.println(result);
	}

	public String squareMatrixByPattern(int n) {
		String result = "";
		int[][] arr = new int[n][n];
		int max = n;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < n; j++) {
					arr[i][j] = max;
					max--;
				}
				max = n;
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
