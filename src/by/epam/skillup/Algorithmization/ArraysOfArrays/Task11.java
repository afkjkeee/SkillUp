package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task11 {
	public static void main(String[] args) {
		Task11 task11 = new Task11();
		String result = task11.matrixRowsWithFrequentNumbers();
		System.out.println(result);
	}

	public String matrixRowsWithFrequentNumbers() {
		String result = "";
		String maxLine = "";
		int[][] arr = new int[10][20];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 16);
				if (arr[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				maxLine = maxLine + "3 и более раз число 5 содержится в строках: " + i + "\n";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result = result + arr[i][j] + " ";
			}
			result += "\n";
		}

		return result + maxLine;
	}
}