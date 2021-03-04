package by.epam.skillup.BasicsCode.Les2;

public class Task3 {
	
	public String coordinats(int x1, int y1, int x2, int y2, int x3, int y3) {

		String result = "Точки не расположены на одной прямой.";

		if ((x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1)) {
			result = "Точки расположены на одной прямой.";
		}

		return result;
	}
}