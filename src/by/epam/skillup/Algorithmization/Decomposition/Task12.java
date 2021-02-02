package by.epam.skillup.Algorithmization.Decomposition;

import java.util.ArrayList;

public class Task12 {
	public static void main(String[] args) {

		Task12 task12 = new Task12();
		String result = task12.numberFroTheSumOfDigits(3, 120);
		System.out.println(result);
	}
	public String numberFroTheSumOfDigits(int K, int N) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i <= N; i++) {
			int count = 0;
			int z = i;

			while (z != 0) {
				z = z / 10;
				count++;
			}
			if (count == K) {
				arr.add(i);
			}
		}
		String result = String.valueOf(arr);

		return result;
	}
}
