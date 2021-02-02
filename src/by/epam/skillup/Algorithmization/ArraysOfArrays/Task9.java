package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task9 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 17, 23, 6 }, { 3, 61, 34, 8 }, { 0, 13, 20, 4 } };

		int maxSum = 0;

		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			int number = j + 1;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
			System.out.println("Сумма чисел в столбце " + number + " равна - " + sum);
		}
		System.out.println();
		System.out.print("Максимальной суммой является число - " + maxSum);
	}
}
