package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task4 {
	public static void main(String[] args) {
		String str = "�����������";

		Task4 task4 = new Task4();
		String result = task4.makeWordCake(str);
		System.out.println(result);
	}

	public String makeWordCake(String str) {
		String cake = String.valueOf(str.charAt(str.indexOf('�')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('�')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('�')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('�')));

		return cake;
	}
}