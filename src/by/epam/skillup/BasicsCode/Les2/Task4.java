package by.epam.skillup.BasicsCode.Les2;

public class Task4 {

	public String proportions(double holeHeightA, double holeWidthB, double brickHightX, double brickWidthY, double brickLengthZ) {

	String result = "������ �� ������� ����� ���������.";
	
	if ((holeHeightA > brickHightX && holeWidthB > brickWidthY) || (holeHeightA > brickHightX && holeWidthB > brickLengthZ)) {
			result = "������ ������� ����� ���������.";
			}
	
	return result;
	}
}