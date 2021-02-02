package by.epam.skillup.BasicsCode.Les2;

public class Task5 {

	private final int X_1 = 2;
	private final int X_2 = 3;

	public double function(double valueX) {

		return (valueX <= 3) ? Math.pow(valueX, X_1) - 3 * valueX + 9 : 1 / (Math.pow(valueX, X_2) + 6);
	}
}