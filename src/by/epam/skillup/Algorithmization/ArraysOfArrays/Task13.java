package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task13 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 17, 23, 6 }, { 3, 61, 34, 8 }, { 0, 13, 20, 4 } };

		Task13 task13 = new Task13();
		String result = task13.sortColumnsInAscendingAndDescendingOrder(arr);
		System.out.println(result);
	}

	public String sortColumnsInAscendingAndDescendingOrder(int[][] arr) {
		String ascendingColumns = "";
		String decreasingColumns = "";

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {

				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i][j] > arr[k][j]) {
						int b = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = b;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				ascendingColumns += arr[i][j] + " ";
			}
			ascendingColumns += "\n";
		}

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {

				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i][j] < arr[k][j]) {
						int b = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = b;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				decreasingColumns += arr[i][j] + " ";
			}
			decreasingColumns += "\n";
		}

		return "Сортировка столбцов по возрастанию: \n" + ascendingColumns + "\nСортировка столбцоы по убыванию: \n"
				+ decreasingColumns;
	}
}
