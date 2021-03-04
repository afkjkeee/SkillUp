package by.epam.skillup.Algorithmization.ArraysOfArrays;

public class Task14 {
	public static void main(String[] args) {
		Task14 task14 = new Task14();
		String result = task14.numberOfOnesEqualColumnNumber(4, 3);
		System.out.println(result);
	}

	public String numberOfOnesEqualColumnNumber(int columnSize, int lineSize) {
		int[][] arr = new int[columnSize][lineSize];
		String result = "";

		if (columnSize < lineSize) {
			result = "¬ысота матрицы должна быть больше ее ширины.";
		} else {
			for (int i = 0; i < columnSize; i++) {
				for (int j = 0; j < lineSize; j++) {
					if (i <= j) {
						arr[i][j] = 1;
					}
					result = result + arr[i][j] + " ";
				}
				result += "\n";
			}
		}

		return result;
	}
}