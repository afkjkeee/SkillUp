package by.epam.skillup.Classes.AggregationAndComposition;

public class TextTest {
	public static void main(String[] args) {
		String textTitle = "Как я провел лето.";
		String firstSentence = "Я люблю лето за его красоту и теплоту. Летом все такое красивое: "
				+ "прекрасные цветы, разноцветные бабочки, удивительные насекомые.";
		String secondSentencce = "Это лето я провел весело и интересно, я ездил в Башкирию.";

		Text text = new Text(textTitle, firstSentence);
		Sentence sentence = new Sentence(secondSentencce);

		text.printTextTitle();
		text.printText();

		text.addSentence(sentence);

		text.printTextTitle();
		text.printText();
	}
}

class Text {
	private String textTitle;
	private StringBuilder text;

	public Text(String textTitle, String text) {
		this.textTitle = textTitle;
		this.text = new StringBuilder();
		this.text.append(text);
	}

	public void printText() {
		System.out.println(text.toString() + "\n");
	}

	public void printTextTitle() {
		System.out.println(textTitle);
	}

	public void addSentence(Sentence sentence) {
		text.append(sentence);
	}
}

class Sentence {
	private String sentence;

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return " " + sentence;
	}
}

class Word {
	private String word;

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
}