package by.epam.skillup.Algorithmization.OneDimensionalArrays;

public class Task8 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 9, 3, 8, 6 };

		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[min]) {
				count++;
			}
		}
		int[] newArray = new int[arr.length - count];

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[min]) {
				arr[i] = newArray[k];
				k++;
			}
		}
		System.out.println(newArray[k]);
	}
}
