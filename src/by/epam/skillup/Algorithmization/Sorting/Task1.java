package by.epam.skillup.Algorithmization.Sorting;

public class Task1 {
	public static void main(String[] args) {

		int[] arrayOne = { 7, 2, 16, 33, 47, 59, 16 };
		int[] arrayTwo = { 36, 11, 5, 87 };

		int k = 3;

		int[] commonArray = new int[arrayOne.length + arrayTwo.length];
		int count = 0;

		for (int i = 0; i <= commonArray.length; i++) {

			if (i < k) {
				commonArray[i] = arrayOne[i];
			} if (i >= k) {
				commonArray[i] = arrayTwo[count];
				count++;
			}
			if (count > arrayTwo.length) {
				commonArray[i] = arrayOne[i - k - 1];
			}
		}
	}
}