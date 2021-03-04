package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task10 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 17, 23 }, { 3, -61, 34 }, { 0, 13, 20 } };

		Task10 task10 = new Task10();
		String result = task10.positiveDiagonalElements(arr);
		System.out.println(result);
	}

	public String positiveDiagonalElements(int[][] arr) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i == j) && arr[i][j] > 0) {
					result = result + arr[i][j] + " ";
				}
			}
		}

		return result;
	}
}
