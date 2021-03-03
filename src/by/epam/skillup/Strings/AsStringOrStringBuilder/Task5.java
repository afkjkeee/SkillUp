package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task5 {
	public static void main(String[] args) {
		String str = "информатика";

		Task5 task5 = new Task5();
		int result = task5.charACount(str);
		System.out.println(result);
	}

	public int charACount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'а') {
				count++;
			}
		}

		return count;
	}
}
