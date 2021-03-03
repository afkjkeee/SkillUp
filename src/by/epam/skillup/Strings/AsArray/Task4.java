package by.epam.skillup.Strings.AsArray;

public class Task4 {
	public static void main(String[] args) {
		String str = "R32p12ac346 th113333l";
		Task4 task4 = new Task4();
		int result = task4.numberCount(str);
		System.out.println(result);
	}

	public int numberCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
					count++;
				}
			}
		}

		return count;
	}
}