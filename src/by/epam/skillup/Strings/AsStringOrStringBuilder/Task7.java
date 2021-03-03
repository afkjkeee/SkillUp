package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task7 {
	public static void main(String[] args) {
		String str = "abc cde def";
		Task7 task7 = new Task7();
		String result = task7.deleteRepeatedChars(str);
		System.out.println(result);
	}

	public String deleteRepeatedChars(String str) {
		str = str.replaceAll("\\s", "");
		StringBuilder strB = new StringBuilder(str);
		for (int i = 0; i < strB.length(); i++) {
			char ch = strB.charAt(i);
			for (int j = i + 1; j < strB.length(); j++) {
				if (strB.charAt(j) == ch) {
					strB.deleteCharAt(j);
				}
			}
		}

		return strB.toString();
	}
}
