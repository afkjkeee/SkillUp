package by.epam.skillup.BasicsCode.Les2;

public class Task2 {

	public String minAndMax(int a, int b, int c, int d) {

		String result = null;

		int minAB = Math.min(a, b);
		int minCD = Math.min(c, d);
		int max = Math.max(minAB, minCD);
		result = "����������� ������ ����� a � b �������� " + minAB + ", ����������� ������ ����� C � D �������� " + minCD
				+ ", ������������ ����� ����������� ����� �������� " + max;
		
		return result;
	}
}
