package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task6 {
	public static void main(String[] args) {
		String str = "информатика";

		Task6 task6 = new Task6();
		String result = task6.doubleChar(str);
		System.out.println(result);
	}

	public String doubleChar(String str) {
		StringBuilder strB = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			strB.append(str.charAt(i));
			strB.append(str.charAt(i));
		}
		return strB.toString();
	}
}
