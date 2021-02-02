package by.epam.skillup.Algorithmization.Decomposition;

public class Task2 {
	public static void main(String[] args) {

		Task2 task2 = new Task2();
		int nodResult = task2.nod(100, 50, 110, 20);
		System.out.println("НОД чисел равен " + nodResult);
	}

	public int nod(int a, int b, int c, int d) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		int ab = a + b;

		while (c != 0 && d != 0) {
			if (c > d) {
				c = c % d;
			} else {
				d = d % c;
			}
		}
		int cd = c + d;

		while (ab != 0 && cd != 0) {
			if (ab > cd) {
				ab = ab % cd;
			} else {
				cd = cd % ab;
			}
		}
		
		return ab + cd;
	}
}
