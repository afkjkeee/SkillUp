package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task3 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 23, 17, 23 }, { 9, 6, 34, 77, 12 }, { 0, 1, 20, 64, 31 } };
		Task3 task3 = new Task3();
		String result = task3.printSelectedLineAndColumn(arr, 3, 3);
		System.out.println(result);

	}

	public String printSelectedLineAndColumn(int[][] arr, int line, int column) {
		String selectedLine = "";
		String selectedColumn = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == (line - 1)) {
					selectedLine = selectedLine + arr[line - 1][j] + " ";
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == (column - 1)) {
					selectedColumn = selectedColumn + arr[i][column - 1] + " ";
				}
			}
		}

		return line + "-я строка матрицы: " + selectedLine + "\n" + column + "-й столбец матрицы: " + selectedColumn;
	}
}
