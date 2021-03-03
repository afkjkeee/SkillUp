package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task10 {
	public static void main(String[] args) {
		String str = "������, ��� ���� ����? ��� ������, � ����? ��� ����. ����!";
		Task10 task10 = new Task10();
		String result = task10.numberOfOffers(str);
		System.out.println(result);
	}

	public String numberOfOffers(String str) {
		int firstStringLength = str.length();
		int stringLengthWithoutMarks = str.replaceAll("[.!?]", "").length();
		int numberOfOffers = firstStringLength - stringLengthWithoutMarks;

		return "���������� ����������� - " + numberOfOffers;
	}
}
