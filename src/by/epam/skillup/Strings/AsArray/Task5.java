package by.epam.skillup.Strings.AsArray;

public class Task5 {
	public static void main(String[] args) {
		String str = " Hello,  how are      you??  ";
		Task5 task5 = new Task5();
		String result = task5.deleteSpaces(str);
		System.out.println(result);
	}

	public String deleteSpaces(String str) {
		return str.replaceAll("\s+", " ").trim();
	}
}
