package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task9 {
	public static void main(String[] args) {
		String str = "Hello Bye String Algorithmization LAgorithmizations";
		Task9 task9 = new Task9();
		String result = task9.counterOfLowerAndUppercase(str);
		System.out.println(result);
	}

	public String counterOfLowerAndUppercase(String str) {

		int lowercaseCount = 0;
		int uppercaseCounnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lowercaseCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				uppercaseCounnt++;
			}
		}

		return "Маленьких букв в тексте - " + lowercaseCount + ", больших - " + uppercaseCounnt;
	}
}
