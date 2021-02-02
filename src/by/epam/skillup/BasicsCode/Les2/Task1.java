package by.epam.skillup.BasicsCode.Les2;

public class Task1 {

	public String figure(double x, double y) {

		String result = null;

		if (x == 0 || y == 0 || x + y >= 180) {
			result = "Такого треугольника не существует";// треугольник может существовать?
		} else if (x + y < 180) {
			result = "Такой треугольник существует.";
			if (x == 90 || y == 90 || x + y == 90) { // отсутствует выделение в блок тела if
				result = "Такой треугольник существует, он прямоугольный.";
			}
		}

		return result;
	}
}