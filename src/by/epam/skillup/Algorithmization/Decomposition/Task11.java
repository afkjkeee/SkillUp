package by.epam.skillup.Algorithmization.Decomposition;

public class Task11 {
	public static void main(String[] args) {

		Task11 task11 = new Task11();
		String result = task11.numbersCount(123, 123);
		System.out.println(result);
	}

	public String numbersCount(int numberOne, int numberTwo) {
		String result = "";
		int countOne = 0;
		int countTwo = 0;

		while (numberOne != 0) {
			numberOne = numberOne / 10;
			countOne++;
		}
		
		while (numberTwo != 0) {
			numberTwo = numberTwo / 10;
			countTwo++;
		}
		
		if (countOne > countTwo) {
			result = "Цифр больше в числе №1";
		} else if (countOne < countTwo) {
			result = "Цифр больше в числе №2";
		} else {
			result = "Количество цифр одинаково в двух числах";
		}

		return result;
	}
}
