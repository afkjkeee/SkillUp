package by.epam.skillup.Algorithmization.Decomposition;

public class Task13 {
	public static void main(String[] args) {
		
		Task13 task13 = new Task13();
		String result = task13.twinNumbers(10);
		System.out.println(result);
	}
	
	public String twinNumbers (int segmentStart) {
		int segmentEnd = 2 * segmentStart;
		String result = "";
		
		if (segmentStart < 2) {
			result = "Ќачало промежутка должно быть больше 2.";
		} else {
			for (int i = segmentStart; i <= segmentEnd; i++) {
				int z = i + 2;
				result = result + " " + i + " и " + z + ", ";
			}
		}
	
		return result;
	}
}
