package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task3 {
	public static void main(String[] args) {
		String str = "101";

		Task3 task3 = new Task3();
		boolean result = task3.isPalindrome(str);
		System.out.println(result);
	}

	public boolean isPalindrome(String str) {
		str = str.toLowerCase();
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
