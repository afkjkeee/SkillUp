package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task4 {
	public static void main(String[] args) {
		String str = "информатика";

		Task4 task4 = new Task4();
		String result = task4.makeWordCake(str);
		System.out.println(result);
	}

	public String makeWordCake(String str) {
		String cake = String.valueOf(str.charAt(str.indexOf('т')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('о')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('р')));
		cake = cake + String.valueOf(str.charAt(str.indexOf('т')));

		return cake;
	}
}