package by.epam.skillup.BasicsCode.Les2;

public class Task2 {

	public String minAndMax(int a, int b, int c, int d) {

		String result = null;

		int minAB = Math.min(a, b);
		int minCD = Math.min(c, d);
		int max = Math.max(minAB, minCD);
		result = "Минимальным числом среди a и b является " + minAB + ", минимальным числом среди C и D является " + minCD
				+ ", максимальным среди минимальных чисел является " + max;
		
		return result;
	}
}
