package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task6 {
	public static void main(String[] args) {

		double[] arr = { -12.3, 7, 0, 53.832, 13, 16, -72, 14, 22, -93, 5.98 };

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
				if (primeNumber(i)) {
					sum = sum + arr[i];
				}
			}
			System.out.println(sum);
		}

	public static boolean primeNumber(int x) {
		if (x < 2) {
			return false;
		}
		int prime;
		for (int i = 2; i <= x / 2; i++) {
			prime = x % i;
			if (prime == 0) {
				return false;
			}
		}
		return true;
	}
}
