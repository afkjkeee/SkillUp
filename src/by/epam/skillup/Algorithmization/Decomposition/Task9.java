package by.epam.skillup.Algorithmization.Decomposition;

public class Task9 {
	public static void main(String[] args) {

		Task9 task9 = new Task9();
		double result = task9.quadrangleArea(1, 2, 3, 4);
		System.out.println(result);
	}

	public double quadrangleArea(double sideX, double sideY, double sideZ, double sideT) {
		double semiPerimetr = (sideX + sideY + sideZ + sideT) / 2;

		return Math.sqrt((semiPerimetr - sideX) * (semiPerimetr - sideY) * (semiPerimetr - sideZ) * (semiPerimetr - sideT));
	}
}
