package by.epam.skillup.Strings.AsStringOrStringBuilder;

public class Task8 {
	public static void main(String[] args) {
		String str = "Hello bye string algorithmization lagorithmizations";
		Task8 task8 = new Task8();
		String result = task8.longestWordSearch(str);
		System.out.println(result);
	}

	public String longestWordSearch(String str) {
		String longestWord = "";
		int maxLength = 0;
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
				longestWord = words[i];
			}
		}

		return longestWord;
	}
}
