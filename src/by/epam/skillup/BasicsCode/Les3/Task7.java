package by.epam.skillup.BasicsCode.Les3;

public class Task7 {
	public static void main(String[] args) {

		Task7 task7 = new Task7();
		String result = task7.sameNumbers(12345, 1.20345);
		System.out.println(result);
	}

	public String sameNumbers(double doubleA, double doubleB) {
		while (doubleA % (int) doubleA > 0) {
			doubleA = doubleA * 10;
		} 
		int a = (int) doubleA;
		
		while (doubleB % (int) doubleB > 0) {
			doubleB = doubleB * 10;
		} 
		int b = (int) doubleB;

		int[] array = new int[10];
		String numbers = "Повторяющиеся числа - ";

		if (a < 0) {
			a = -a;
		}
		if (b < 0) {
			b = -b;
		}

		while (a != 0) {
			array[a % 10]++;
			a = a / 10;
		}
		while (b != 0) {
			int z = b % 10;
			if (array[z] != 0)
				numbers = numbers + z + " ";
			b = b / 10;
		}
		return numbers;
	}
}
