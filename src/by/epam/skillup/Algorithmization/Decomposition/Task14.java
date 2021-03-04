package by.epam.skillup.Algorithmization.Decomposition;

public class Task14 {
	public static void main(String[] args) {

		Task14 task14 = new Task14();
		String result = task14.amstrongNumbers(400);
		System.out.println(result);
	}

	public String amstrongNumbers(int segmentEnd) {
		String result = "";
		for (int i = 1; i < segmentEnd; i++) {
			if (sum(i) == i) {
				result = result + i + " ";
			}
		}

		return result;
	}

	public int sum(int a) {
		int sumResult = 0;
		int d = numberLength(a);
		int b = a % 10;
		while (a >= 1) {
			sumResult += Math.pow(b, d);
			a = a / 10;
			b = a % 10;
		}

		return sumResult;
	}

	private int numberLength(int a) {
		int length = 0;
		while (a >= 1) {
			length++;
			a = a / 10;
		}

		return length;
	}
}
