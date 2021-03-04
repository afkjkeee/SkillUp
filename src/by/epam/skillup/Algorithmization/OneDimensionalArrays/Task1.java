package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task1 {
	public static void main(String[] args) {
		int[] array = { 1, 7, 12, 22, 33, 47 };

		Task1 task1 = new Task1();
		String result = task1.sumOfMultiplesOfK(array, 0);
		System.out.println(result);
	}

	public String sumOfMultiplesOfK(int[] array, int k) {
		int sum = 0;
		String result = "";
		if (k == 0) {
			result = "Делить на 0 нельзя!";
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] % k == 0) {
					sum = sum + array[i];
				}
				result = "Сумма чисел кратных " + k + " равна - " + sum;
			}
		}

		return result;
	}
}
