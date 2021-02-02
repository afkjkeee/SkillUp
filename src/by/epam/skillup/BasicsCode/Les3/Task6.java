package by.epam.skillup.BasicsCode.Les3;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		System.out.print("¬ведите натуральное число, соотутствующее началу промежутка: ");
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt();

		System.out.print("¬ведите натуральное число, соотутствующее концу промежутка: ");
		int n = sr.nextInt();
		sr.close();

		Task6 task6 = new Task6();
		String result = task6.divisors(m, n);
		System.out.println(result);
	}

	public String divisors(int m, int n) {
		String result = "";

		for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
			int number = i;
			String divisors = "";
			boolean isFirstDivisor = true;

			for (int b = 2; b < i; b++) {
				if (i % b == 0) {
					if (isFirstDivisor) {
						divisors = divisors + b;
						isFirstDivisor = false;
					} else {
						divisors = divisors + ", " + b;
					}
				}
			}
			String resultOutput = divisors.equals("") ? "ƒелители числа " + number + ": " + "делителей нет"
					: "ƒелители числа " + number + ": " + divisors;
			result = result + resultOutput + "\n";
		}
		return result;
	}
}