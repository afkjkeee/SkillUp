package by.epam.skillup.BasicsCode.Les3;

public class Task3 {

	public int sumPow(int value) {

		int result = 0;

		for (int i = 0; i <= 100; i++) {
			result += Math.pow(i, 2);
		}

		return result;
	}
}
