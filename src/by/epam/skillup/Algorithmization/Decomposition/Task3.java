package by.epam.skillup.Algorithmization.Decomposition;

public class Task3 {
	public static void main(String[] args) {
		
		Task3 task3 = new Task3();
		double result = task3.hexagonArea(15);
		System.out.println(result);
	}

	public double hexagonArea(double a) {
		return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
	}
}
