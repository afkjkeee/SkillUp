package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task9 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 3, 1, 16, 3, 16, 16 };

		Task9 task9 = new Task9();
		int result = task9.mosPopularNumber(arr);
		System.out.println(result);
	}

	public int mosPopularNumber(int[] arr) {
		int count2 = 0;
		int count1 = 0;
		int pupular1 = 0;
		int popular2 = 0;

		for (int i = 0; i < arr.length; i++) {
			pupular1 = arr[i];
			count1 = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (pupular1 == arr[j])
					count1++;
			}
			if (count1 > count2) {
				popular2 = pupular1;
				count2 = count1;
			} else if (count1 == count2) {
				popular2 = Math.min(popular2, pupular1);
			}
		}

		return popular2;
	}
}
