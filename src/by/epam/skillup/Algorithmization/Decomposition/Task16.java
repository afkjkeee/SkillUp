package by.epam.skillup.Algorithmization.Decomposition;

public class Task16 {
	public static void main(String[] args) {
		Task16 task16 = new Task16();
		int result = task16.sumOfNumbers(2);
		String positiveNum = task16.positiveNumbers(result);
		System.out.println("Сумма равна - " + result);
		System.out.println(positiveNum);
	}

	public int sumOfNumbers(int n) {

		int sum = 0;
		int i = 0;
		while (numberLength(i) < n) {
			i++;
		}
		while (numberLength(i) == n) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		}

		return sum;
	}

	public int numberLength(int a) {
		int length = 0;
		while (a >= 1) {
			length++;
			a = a / 10;
		}

		return length;
	}

	public String positiveNumbers(int a) {
		String result = "";
		int[] arr = new int[numberLength(a)];
		while (a != 0) {
			for (int i = 0; i < arr.length; i++) {
				int z = a % 10;
				if (z % 2 == 0) {
					arr[i] = z;
					result = result + z + " ";
				}
				a = a / 10;
			}
		}
		result = "Положительные числа - " + result;

		return result;
	}
}
