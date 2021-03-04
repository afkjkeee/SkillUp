package by.epam.skillup.Algorithmization.Decomposition;

public class Task17 {
	public static void main(String[] args) {
		Task17 task17 = new Task17();
		int result = task17.sumOfNumerals(1999999999);
		System.out.println("����� ���� ��������� ����� - " + result);
		int count = 1;
		while (task17.numberLength(result) >= 2) {
			result = task17.sumOfNumerals(result);
			count++;
			System.out.println("����� ���� ����������� ����� - " + result);
		}
		System.out.println("���������� �������� - " + count);
	}

	public int sumOfNumerals(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}

		return sum;
	}

	public int numberLength(int a) {
		int length = 0;
		while (a >= 1) {
			length++;
			a = a / 10;
		}

		return length;
	}
}
