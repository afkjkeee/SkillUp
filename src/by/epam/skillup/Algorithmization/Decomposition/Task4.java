package by.epam.skillup.Algorithmization.Decomposition;

public class Task4 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 7, 9 }, { 13, 8 }, { 10, -1 }, { 0, 3 } };
		Task4 task4 = new Task4();
		String result = task4.maxDistBetweenDots(arr);
		System.out.println(result);
	}

	public String maxDistBetweenDots(int[][] dots) {
		int[][] maxDots = new int[2][2];
		double maxDist = 0;
		for (int i = 0; i < dots.length - 1; i++) {
			for (int j = i + 1; j < dots.length; j++) {
				double dist = distance(dots[i], dots[j]);
				if (dist > maxDist) {
					maxDist = dist;
					maxDots[0] = dots[i];
					maxDots[1] = dots[j];
				}
			}
		}

		return "Максимальное расстояние между точками с координатами " + "(" + maxDots[0][0] + ";" + maxDots[0][1] + ")"
				+ " и " + "(" + maxDots[1][0] + ";" + maxDots[1][1] + ")";
	}

	private double distance(int[] dotOne, int[] dotTwo) {
		return Math.sqrt(
				(dotTwo[0] - dotOne[0]) * (dotTwo[0] - dotOne[0]) + (dotTwo[1] - dotOne[1]) * (dotTwo[1] - dotOne[1]));
	}
}
