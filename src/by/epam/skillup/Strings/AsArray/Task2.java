package by.epam.skillup.Strings.AsArray;

public class Task2 {
	public static void main(String[] args) {
		String str = "Replace this word and this word.";
		Task2 task2 = new Task2();
		String result = task2.replaceWord(str);
		System.out.println(result);
	}

	public String replaceWord(String str) {
		String target = "word";
		String replacement = "letter";
		str = str.replaceAll(target, replacement);

		return str;
	}
}
