package by.epam.skillup.BasicsCode.Les2;

public class Task4 {

	public String proportions(double holeHeightA, double holeWidthB, double brickHightX, double brickWidthY, double brickLengthZ) {

	String result = "Кирпич не пройдет через отверстие.";
	
	if ((holeHeightA > brickHightX && holeWidthB > brickWidthY) || (holeHeightA > brickHightX && holeWidthB > brickLengthZ)) {
			result = "Кирпич пройдет через отверстие.";
			}
	
	return result;
	}
}