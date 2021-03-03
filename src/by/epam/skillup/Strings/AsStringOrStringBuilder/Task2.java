package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task2 {
	public static void main(String[] args) {
		String str = "Hallo, haw are you??";
		Task2 task2 = new Task2();
		String result = task2.printBAfterA(str);
		System.out.println(result);
	}

	public String printBAfterA(String str) {
		StringBuilder strB = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				strB.append("ab");
			} else {
				strB.append(str.charAt(i));
			}
		}

		return strB.toString();
	}
}
