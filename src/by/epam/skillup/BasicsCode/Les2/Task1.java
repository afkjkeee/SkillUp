package by.epam.skillup.BasicsCode.Les2;

public class Task1 {

	public String figure(double x, double y) {

		String result = null;

		if (x == 0 || y == 0 || x + y >= 180) {
			result = "������ ������������ �� ����������";// ����������� ����� ������������?
		} else if (x + y < 180) {
			result = "����� ����������� ����������.";
			if (x == 90 || y == 90 || x + y == 90) { // ����������� ��������� � ���� ���� if
				result = "����� ����������� ����������, �� �������������.";
			}
		}

		return result;
	}
}