package by.epam.skillup.BasicsOfOOP.Task1;

public class File {
	private String fileName;
	private TextFile text;

	public File(String fileName) {
		this.fileName = fileName;
		this.text = new TextFile("");
	}

	public void printText() {
		System.out.println(text.getText());
	}

	public void addText(String text) {
		this.text.addText(text);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public TextFile getText() {
		return text;
	}

	public void setText(TextFile text) {
		this.text = text;
	}
}
