package by.epam.skillup.BasicsOfOOP.Task1;

public class TextFile {
	private StringBuilder text;

	public TextFile(String text) {
		this.text = new StringBuilder();
		this.text.append(text);
	}

	public void addText(String text) {
		this.text.append(' ');
		this.text.append(text).toString();
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}
}
