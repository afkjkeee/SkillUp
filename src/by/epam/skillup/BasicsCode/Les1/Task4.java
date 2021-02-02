package by.epam.skillup.BasicsCode.Les1;

public class Task4 {

	public double reverceNumber(double a) {
		double b = (int) a;

		return (a * 1000) % 1000 + b / 1000.0;
	}
}