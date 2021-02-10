package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task7 {
	private final int A1 = 2;

	public static void main(String[] args) {
		Task7 task7 = new Task7();
		String result = task7.squareMatrixByAGivenRule(4);
		System.out.println(result);
	}

	public String squareMatrixByAGivenRule(int n) {
		String result = "";
		int count = 0;

		double[][] arr = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = Math.sin((Math.pow(i, A1) - Math.pow(j, A1)) / n);
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result = result + arr[i][j] + " ";
			}
			result += "\n";
		}

		return result + "\n" + "Число положительных элементов в матрице: " + count;
	}
}
