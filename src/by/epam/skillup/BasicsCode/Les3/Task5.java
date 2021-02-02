package by.epam.skillup.BasicsCode.Les3;

public class Task5 {
	public static void main(String[] args) {

		Task5 task5 = new Task5();
		task5.symbolsTable();
	}
	
	public void symbolsTable() {
		for (int i = 1; i < 100; i++) {
			char ch = (char) i;
			
			System.out.printf("%3s %5s", i, ch + "\n");
		}
	}
}
