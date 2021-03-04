package by.epam.skillup.BasicsCode.Les1;

public class Task3 {
	
	public double Function3 (double X, double Y) {
		
		double radiansX = Math.toRadians(X);
		double radiansY = Math.toRadians(Y);
		
		return ((Math.sin(radiansX) + Math.cos(radiansY)) / (Math.cos(radiansX) - Math.sin(radiansY))) * (Math.tan(radiansX * radiansY));
		}
}