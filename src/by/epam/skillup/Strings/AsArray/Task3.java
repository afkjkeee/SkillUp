package by.epam.skillup.Strings.AsArray;

public class Task3 {
	public static void main(String[] args) {
		String str = "R3p1ac3 th1s t3xt";
		Task3 task3 = new Task3();
		int result = task3.digitsInStringCount(str);
		System.out.println(result);
	}

	public int digitsInStringCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}

		return count;
	}
}
