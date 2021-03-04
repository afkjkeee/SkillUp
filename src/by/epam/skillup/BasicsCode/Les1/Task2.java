package by.epam.skillup.BasicsCode.Les1;

public class Task2 {
	
		private final int a1 = 3;
		private final int b1 = 2;
		private final int b2 = -2;
		
		public double Function2 (double a, double b, double c) {
			
			return ((b + Math.sqrt(Math.pow(b, b1) + (4 * a * c))) / (2 * a)) - (Math.pow(a, a1) * c) + (Math.pow(b, b2));
		}
}
