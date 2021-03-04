package by.epam.skillup.Algorithmization.Decomposition;

public class Task7 {
	public static void main(String[] args) {
		Task7 task7 = new Task7();
		int result = task7.sumOfFactorialdOfOddNubers();
		System.out.println(result);
	}

	public int sumOfFactorialdOfOddNubers() {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			int factorial = 1;
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					factorial = factorial * j;
				}
				sum = sum + factorial;
			}
		}

		return sum;
	}
}
