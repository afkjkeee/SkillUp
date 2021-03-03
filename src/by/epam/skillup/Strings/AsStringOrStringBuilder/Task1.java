package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task1 {
	public static void main(String[] args) {
		String str = " Hello,  how are       you??  ";
		Task1 task1 = new Task1();
		String result = task1.specesCount(str);
		System.out.println(result);
	}

	public String specesCount(String str) {
		int count = 0;
		int maxSpaces = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			} else {
				if (count > maxSpaces) {
					maxSpaces = count;
				}
				count = 0;
			}
		}

		return "Максимальное число пробелов - " + maxSpaces;
	}
}