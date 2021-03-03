package by.epam.skillup.Strings.RegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String[] args) throws IOException {
		String text = "Первый абзац. Два предложения.\n" + "Второй абзац. Три предложения. Это третье предложение.\n"
				+ "Третий абзац.\n" + "Четвертый абзац и пять предложений. Второе. Третье. Четвертое. Пятое.\n"
				+ "Пятый абзац. Пятный. Пятый. Четыре предложения\n";

		makeTextOperation(text);
	}

	private static void makeTextOperation(String text) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String start = "Введите 1 для сортировки абзацев по количеству предложений;\n"
				+ "Введите 2 для сортировки слов по длине;\n" + "Введите 3 для сортировки лексем в предложениях;\n"
				+ "Для завершения введите exit.\n";
		String choice = "";
		System.out.println(start);
		while (!choice.equalsIgnoreCase("exit")) {
			System.out.print("Введите команду: ");
			choice = reader.readLine();
			switch (choice) {
			case "1":
				sortingParagraphs(text);
				break;
			case "2":
				sortingWordsByLength(text);
				break;
			case "3":
				sortLexemes(text);
				break;
			case "exit":
				System.out.println("Пока.");
				break;
			default:
				System.out.println("Неверная команда.\n");
			}
		}
	}

	private static void sortingParagraphs(String text) {
		String[] paragraphs = text.split("\n");
		int[] counterSentences = new int[paragraphs.length];
		int maxLengthParagraph = 0;
		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentences = splitSentences(paragraphs[i]);
			counterSentences[i] = sentences.length;
			if (maxLengthParagraph < sentences.length) {
				maxLengthParagraph = sentences.length;
			}
		}

		for (int i = 1; i <= maxLengthParagraph; i++) {
			for (int j = 0; j < counterSentences.length; j++) {
				if (i == counterSentences[j]) {
					System.out.println(paragraphs[j]);
				}
			}
		}
		System.out.println();
	}

	private static void sortingWordsByLength(String text) {
		String[] paragraphs = text.split("\n");
		for (String paragraph : paragraphs) {
			String[] sentences = splitSentences(paragraph);
			for (String sentence : sentences) {
				String[] words = splitWords(sentence);

				for (int k = words.length - 1; k >= 0; k--) {
					for (int m = 0; m < k; m++) {
						if (words[m].length() > words[m + 1].length()) {
							String tmp = words[m];
							words[m] = words[m + 1];
							words[m + 1] = tmp;
						}
					}
				}

				for (String word : words) {
					System.out.print(word + " ");
				}
				System.out.print("\b. ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void sortLexemes(String text) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите символ для сортировки лексем по убыванию: ");
		String letter = reader.readLine();
		String[] paragraphs = text.split("\n");
		for (String paragraph : paragraphs) {
			String[] sentences = splitSentences(paragraph);
			for (String sentence : sentences) {
				String[] words = splitWords(sentence);

				for (int k = words.length - 1; k >= 0; k--) {
					for (int m = 0; m < k; m++) {
						int countRight = 0;
						int countLeft = 0;
						for (int n = 0; n < words[m].length(); n++) {
							if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
								countLeft++;
							}
						}
						for (int n = 0; n < words[m + 1].length(); n++) { 
							if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
								countRight++;
							}
						}
						if (countLeft < countRight) {
							String tmp = words[m];
							words[m] = words[m + 1];
							words[m + 1] = tmp;
						} else if (countLeft == countRight) { 
							String[] forCompare = { words[m], words[m + 1] };
							Arrays.sort(forCompare);
							words[m] = forCompare[0];
							words[m + 1] = forCompare[1];
						}
					}
				}

				for (String word : words) {
					System.out.print(word + " ");
				}
				System.out.print("\b. ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static String[] splitSentences(String text) {
		Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
		return pattern.split(text);
	}

	private static String[] splitWords(String sentence) {
		Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
		return pattern.split(sentence);
	}
}
