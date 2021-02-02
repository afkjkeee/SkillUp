package by.epam.skillup.BasicsCode.Les3;

public class Task2 {
	public static void main(String[] args) {

		Task2 task2 = new Task2();
		String result = task2.funcCalculation(-2, 7, 1, 0);
		System.out.println(result);
	}

	public String funcCalculation(int a, int b, int h, int x) {
		String result = "";
		
		if (x > 2) {
			for (int i = x; i <= b; i += h) {
				result = result + i + " ";
			}
		} 
		if (x <= 2) {
			for (int j = a; j < x; j += h) {
				result = result + j + " ";
			}
		}
		
		return result;
	}
}
