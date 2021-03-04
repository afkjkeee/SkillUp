package by.epam.skillup.Algorithmization.Decomposition;

public class Task8 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 9, 7, 6, 8 };

		Task8 task8 = new Task8();
		int result = task8.sumOfThreeElements(arr, 1);
		System.out.println(result);
	}

	public int sumOfThreeElements(int[] arr, int firstElement) {
		int firstElementInMassive = firstElement - 1;
		int secondElement = firstElementInMassive + 2;
		int sum = 0;

		for (int i = firstElementInMassive; i <= secondElement; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}
}
