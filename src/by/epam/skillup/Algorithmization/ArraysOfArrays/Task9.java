package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task9 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 17, 23, 6 }, { 3, 61, 34, 8 }, { 0, 13, 20, 4 } };

		Task9 task9 = new Task9();
		String result = task9.columnWithMaxSum(arr);
		System.out.println(result);
	}

	public String columnWithMaxSum(int[][] arr) {
		String result = "";
		int maxSum = 0;
		int columnIdWithMaxSum = 0;

		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			int number = j + 1;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				columnIdWithMaxSum = number;
			}
			result = result + "Сумма чисел в столбце " + number + " равна - " + sum + "\n";
		}

		return result + "Столбец с максимальной суммой элементов - " + columnIdWithMaxSum;
	}
}
