package by.epam.skillup.Algorithmization.Decomposition;

public class Task15 {
	public static void main(String[] args) {

		Task15 task15 = new Task15();
		String result = task15.consecutiveNumbers(2);
		System.out.println(result);

	}

	public String consecutiveNumbers(int n) {
		String result = "";
		int i = 0;
		while (numberLength(i) < n) {
			i++;
		}
		while (numberLength(i) == n) {
			if (areTheNumbersIncreasing(i)) {
				result = result + i + " ";
			}
			i++;
		}

		return result;
	}

	public int numberLength(int a) {
		int length = 0;
		while (a >= 1) {
			length++;
			a = a / 10;
		}

		return length;
	}

	public boolean areTheNumbersIncreasing(int a) {
		int[] arr = new int[numberLength(a)];
		while (a != 0) {
			for (int i = arr.length - 1; i >= 0; i--) {
				int z = a % 10;
				arr[i] = z;
				a = a / 10;
			}
		}
		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				flag = false;
				break;
			}
		}

		return flag;
	}
}