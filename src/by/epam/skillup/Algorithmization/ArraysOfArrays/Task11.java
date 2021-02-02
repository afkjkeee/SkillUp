package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task11 {
	public static void main(String[] args) {

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
				System.out.println("Ѕольше 3 раз число 5 содержитс€ в строках: " + i);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
