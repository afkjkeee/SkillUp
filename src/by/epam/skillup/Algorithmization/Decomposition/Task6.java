package by.epam.skillup.Algorithmization.Decomposition;

public class Task6 {
	public static void main(String[] args) {
		
		Task6 task6 = new Task6();
		String nodResult = task6.mutuallySimple(8, 2, 10);
		System.out.println(nodResult);
	}

	public String mutuallySimple(int a, int b, int c) {
		String result = "„исла не €вл€ютс€ взаимно простыми.";

		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		int ab = a + b;

		while (ab != 0 && c != 0) {
			if (ab > c) {
				ab = ab % c;
			} else {
				c = c % ab;
			}
		}
		if (ab + c == 1) {
			result = "„исла €вл€ютс€ взаимно простыми.";
		}
		
		return result;
	}
}
