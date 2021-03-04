
package by.epam.skillup.Algorithmization.Decomposition;

public class Task1 {
	static int a = 200;
	static int b = 56;
	
	public static void main(String[] args) {

		Task1 task1 = new Task1();
		int nodResult = task1.nod();
		int nokResult = a * b / nodResult;
		System.out.println("ÍÎÄ ÷èñåë ğàâåí " + nodResult);
		System.out.println("ÍÎÊ ÷èñåë ğàâåí " + nokResult);
	}

	public int nod() {
		int c = a;
		int d = b;
		while (c != 0 && d != 0) {
			if (c > d) {
				c = c % d;
			} else {
				d = d % c;
			}
		}

		return c + d;
	}
}
