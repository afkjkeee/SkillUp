package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task1 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 23, 17, 23 }, { 9, 6, 34, 77, 12 }, { 0, 1, 20, 64, 31 } };

		Task1 task1 = new Task1();
		String result = task1.oddColumnsWithMaxEement(arr);
		System.out.println(result);
	}

	public String oddColumnsWithMaxEement(int[][] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j += 2) {
				if (arr[0][j] > arr[arr.length - 1][j]) {
					result = result + arr[i][j] + " ";
				}
			}
			result += "\n";
		}

		return result;
	}
}