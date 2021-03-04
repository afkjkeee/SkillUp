package by.epam.skillup.BasicsCode.Les3;

import java.math.BigInteger;

public class Cycles {
	public static void main(String[] args) {

		Task1 task1 = new Task1();
		int result = task1.sumBefore(7);
		System.out.println(result);

		Task3 task3 = new Task3();
		int sum = task3.sumPow(100);
		System.out.println(sum);

		Task4 task4 = new Task4();
		BigInteger compl = task4.compPow(200);
		System.out.println(compl);

	}
}